import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    stringPermutation("abba");
  }

  public static boolean stringPermutation(String s) {
    HashMap<Character, Integer> sh = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (sh.containsKey(s.charAt(i))) {
        sh.put(s.charAt(i), sh.get(s.charAt(i)) + 1);

      } else {
        sh.put(s.charAt(i), 1);
      }
    }
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (sh.get(s.charAt(i)) % 2 != 0 && count > 1) {
        return false;
      } else if (sh.get(s.charAt(i)) % 2 != 0) {
        count++;
      } else {
        return true;
      }
      ;
    }
    System.out.println(sh);

    return false;

  }
}
