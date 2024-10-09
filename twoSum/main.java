import java.util.HashMap;

class main {

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int target = 10;
    twoSum(nums, target);
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        result[0] = map.get(complement);
        result[1] = i;
        System.out.println(result[0]);
        System.out.println(result[1]);

        return result;

      } else {
        map.put(nums[i], i);
      }
    }
    return nums;
  }
}
