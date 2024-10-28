
class main {
  public static void main(String[] args) {

  }

  public static int[] sum(int[] numbers, int target) {
    int[] res = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          res[0] = i;
          res[1] = j;
          return res;
        }
      }
    }
    return res;

  }

  public static int[] sum2(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length;
    int[] res = new int[2];

    while (left < right) {
      int tmpSum = numbers[left] + numbers[right];
      if (tmpSum == target) {
        return res;
      } else if (tmpSum > target) {
        right--;
      } else {
        left++;
      }
    }
    return res;

  }
}
