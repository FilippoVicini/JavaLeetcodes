import java.lang.StringBuilder;

class Main {
  public static void main(String[] args) {
    url("te st");
  }

  public static String url(String url) {
    char[] string = new char[url.length()];
    StringBuilder sb = new StringBuilder(url);
    String news;
    for (int i = 0; i < string.length; i++) {
      if (sb.charAt(i) == ' ') {
        sb.replace(i, i + 2, "%20");
      }
    }
    news = String.valueOf(string);
    news = sb.toString();
    System.out.print(news);

    return news;
  }
}
