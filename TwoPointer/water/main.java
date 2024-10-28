class main {
  public static void main(String[] args) {

  }

  public static int water(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;
    while (left < right) {
      int currArea = (right - left) * Math.min(height[left], height[right]);

      if (currArea > maxArea) {
        maxArea = currArea;
      }

      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
  }
}
