import java.util.Arrays;
import java.util.HashSet;

public class main {
  public static void main(String[] args) {

  }

  // Brute force solution
  public static int removeDuplicates(int[] nums) {

    // nums in increasing order
    // remove duplicated element appears only once
    // relative order should be kept the same
    if (nums.length == 1) {
      return 1;
    }
    HashSet<Integer> n = new HashSet<>();
    n.add(nums[0]);
    for (int i = 1; i < nums.length; i++) {
      if (!n.contains(nums[i])) {
        n.add(nums[i]);
      }

    }
    Integer[] l2 = n.toArray(new Integer[0]);
    System.out.print(Arrays.toString(l2));
    Arrays.sort(l2);
    for (int i = 0; i < l2.length; i++) {
      nums[i] = l2[i];
    }
    int k = n.size();

    System.out.print(Arrays.toString(l2));
    System.out.print(Arrays.toString(nums));
    return k;
  }

  // Crazy simple solution
  public static int removeDuplicates2(int[] nums) {
    int j = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[j] = nums[i];
        j++;
      }
    }
    return j;
  }
}
