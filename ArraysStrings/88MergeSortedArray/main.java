import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    int[] nums1 = new int[] { 1, 2, 3, 4, 0, 0, 0 };
    int[] nums2 = new int[] { 5, 6, 7 };
    int m = 4;
    int n = nums2.length;
    merge2(nums1, m, nums2, n);

  }

  // Optimized solution
  // Time complexity = O(n)
  // Space complexity = O(1)
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int midx = m - 1;
    int nidx = n - 1;
    int right = m + n - 1;

    while (nidx >= 0) {
      if (midx >= 0 && nums1[midx] > nums2[nidx]) {
        nums1[right] = nums1[midx];
        midx--;
      } else {
        nums1[right] = nums2[nidx];
        nidx--;
      }
      right--;
    }
    System.out.print(Arrays.toString(nums1));

  }

  public static void merge2(int[] nums1, int m, int[] nums2, int n) {
    int[] tmp = new int[nums1.length];

    int i = 0, j = 0, k = 0;

    // Merge elements from nums1 and nums2 until one of them is exhausted
    while (i < m && j < n) {
      if (nums1[i] <= nums2[j]) {
        tmp[k++] = nums1[i++];
      } else {
        tmp[k++] = nums2[j++];
      }
    }
    // Copy any remaining elements from nums1
    while (i < m) {
      tmp[k++] = nums1[i++];
    }

    // Copy any remaining elements from nums2
    while (j < n) {
      tmp[k++] = nums2[j++];
    }

    for (int a = 0; a < nums1.length; a++) {
      nums1[a] = tmp[a];

    }

    System.out.print(Arrays.toString(tmp));
    System.out.println(Arrays.toString(nums1));

  }
}
