class sum {
  public static void main(String[] args) {

  }

  public static int sum(int[] numbers, int target) {
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

  }
}
