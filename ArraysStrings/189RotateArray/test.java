import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    rotate(nums, 3);
  }

  // O(n) time complexity, O(1) space complexity
  public static void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
  // O(n^2) solution brute force
  /*
   * public static void rotate(int[] nums, int k) {
   * int i = 0;
   * 
   * while (i < k) {
   * int len = nums.length - 1;
   * int last = nums[len];
   * 
   * for (int j = len - 1; j >= 0; j--) {
   * nums[j + 1] = nums[j];
   * }
   * nums[0] = last;
   * i++;
   * }
   * System.out.println(Arrays.toString(nums));
   * }
   */

}
