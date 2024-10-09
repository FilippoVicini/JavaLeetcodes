import java.util.HashMap;
import java.util.Arrays;

public class main {
  public static void main(String[] args) {

  }

  // brute force first method
  public static int majorityElement(int[] nums) {
    int m = 0;
    HashMap<Integer, Integer> n = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (n.containsKey(nums[i])) {
        n.put(nums[i], n.get(nums[i]) + 1);
      } else {
        n.put(nums[i], 1);
      }
    }
    int majorityElement = nums[0];
    int maxCount = 0;

    for (HashMap.Entry<Integer, Integer> entry : n.entrySet()) {
      int key = entry.getKey();
      int count = entry.getValue();
      if (count > maxCount) {
        maxCount = count;
        majorityElement = key;
      }
    }
    System.out.print(n);
    System.out.print(m);
    return majorityElement;
  }

  // Super simple method
  public static int majorityElement2(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    return nums[n / 2];
  }
}
