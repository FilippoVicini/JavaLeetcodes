import java.util.Arrays;

public class main {
  public static void main(String[] args) {
    int[] citations = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    System.out.println(hIndex(citations));
  }

  // O(n) time complexity
  public static int hIndex(int[] citations) {

    int n = citations.length;
    Arrays.sort(citations);
    int hindex = 0;
    for (int i = 0; i < n; i++) {
      int h = n - i;
      if (citations[i] >= h) {
        hindex = h;
        break;
      }
    }
    return hindex;
  }

  /*
   * check if at least citations.length > citatations.length
   * if not check if at least citations.length postitions -1 > citations.length
   * 
   * set h = citatations.length
   * loop through
   * if ( citations[i] > citations.length) increase count
   * if count >= citations.length return true
   * if not decrease h
   * 
   * O(n^2) Time complexity
   * 
   * 
   * public static int hIndex(int[] citations) {
   * int h = citations.length;
   * 
   * while (h > 0) {
   * int count = 0;
   * for (int i = 0; i < citations.length; i++) {
   * if (citations[i] >= h) {
   * count++;
   * }
   * }
   * 
   * if (count >= h) {
   * return h;
   * }
   * 
   * h--;
   * }
   * return 0;
   * }
   */

}
