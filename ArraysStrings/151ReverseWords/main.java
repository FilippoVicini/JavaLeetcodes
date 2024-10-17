public class main {
  public static void main(String[] args) {
    String s = "Hello world";
    reverseWords(s);
  }

  public static String reverseWords(String s) {

    String[] myArray = s.trim().split("\\s+");
    String s2;

    StringBuffer sb = new StringBuffer();
    for (int i = myArray.length - 1; i >= 0; i--) {
      sb.append(myArray[i]);
      if (i != 0) {
        sb.append(" ");
      }
    }
    s2 = sb.toString();
    System.out.print(s2);
    return s2;
  }
}
