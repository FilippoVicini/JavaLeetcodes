import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    int[] nums = new int[] { 3, 2, 2, 3 };
    int val = 3;
    removeElement(nums, val);
  }

  // naive solution first that came up to mind
  // decent complexity time and space
  // not the best looking
  public static int removeElement(int[] nums, int val) {

    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        count++;
      }
    }
    int[] arr = new int[count];
    int incr = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        arr[incr] = nums[i];
        incr++;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      nums[i] = arr[i];
    }
    System.out.print(Arrays.toString(arr));

    return count;

  }

  // Optimized solution in O(n) time complexity and O(1) space complexity

  public static int removeElement2(int[] nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index] = nums[i];
        index++;
      }
    }
    return index;
  }
}
