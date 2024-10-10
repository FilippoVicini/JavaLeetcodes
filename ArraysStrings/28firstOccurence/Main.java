public class Main {
  public static void main(String[] args) {
    System.out.print(strStr("Hello", "llo"));
  }

  public static int strStr(String haystack, String needle) {
    if (haystack.length() == 0) {
      return 0;
    } else {
      return haystack.indexOf(needle);
    }
  }
}
