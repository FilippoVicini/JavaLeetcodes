
public class Main {
  public static void main(String[] args) {
    lengthOfLastWord("hello");
  }

  public static int lengthOfLastWord(String s) {
    int count = 0;
    int n = s.length();

    int i;
    for (i = n - 1; i >= 0; i--) {
      if (s.charAt(i) != ' ') {
        break;
      }
    }

    for (; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        break;
      }
      count++;
    }

    return count;
  }
}
