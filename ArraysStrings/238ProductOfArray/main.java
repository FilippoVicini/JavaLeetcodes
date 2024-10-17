import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3, 4, 5 };
    productExceptSelf(nums);
  }

  public static int[] productExceptSelf(int[] nums) {
    int[] arrayM = new int[nums.length];
    int[] arrayL = new int[nums.length];
    int[] arrayR = new int[nums.length];

    int count = 1;
    arrayM[0] = 1;

    for (int i = 1; i < nums.length; i++) {
      count = nums[i - 1] * count;
      arrayM[i] = count;

    }
    System.out.print(Arrays.toString(arrayM));

    count = 1;
    arrayL[nums.length - 1] = 1;
    for (int i = nums.length - 2; i >= 0; i--) {
      count = nums[i + 1] * count;
      arrayL[i] = count;

    }
    System.out.print(Arrays.toString(arrayL));

    for (int i = 0; i < nums.length; i++) {
      arrayR[i] = arrayM[i] * arrayL[i];

    }
    System.out.print(Arrays.toString(arrayR));

    return arrayR;
  }
}
