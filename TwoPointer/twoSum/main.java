public class main {
  public static void main() {
    int[] numbers = new int[] { 1, 2, 4 };
    int target = 5;
    twoSum(numbers, target);
  }

  public static int[] twoSum(int[] numbers, int target) {
    int right = numbers.length - 1;
    int left = 0;
    int[] nums = new int[2];
    while (left < right) {
      int sum = numbers[right] + numbers[left];
      if (sum == target) {
        nums[0] = left + 1;
        nums[1] = right + 1;
        System.out.print(right + "left" + left);
        return nums;
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }

    }
    return nums;
  }

}
