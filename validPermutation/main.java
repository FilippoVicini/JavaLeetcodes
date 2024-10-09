
import java.util.ArrayList;
import java.util.HashMap;

class main {
  public static void main(String[] args) {
    Permutation("abacus", "abaaaacus");
  }

  public static boolean Permutation(String a, String b) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < a.length(); i++) {
      if (!map.containsKey(a.charAt(i))) {
        map.put(a.charAt(i), 1);
      } else {
        map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
      }
    }

    for (int i = 0; i < b.length(); i++) {
      if (map.containsKey(b.charAt(i)) && map.get(b.charAt(i)) > 0) {
        map.put(b.charAt(i), map.get(b.charAt(i)) - 1);

      } else {
        return false;
      }
    }
    return map.values().stream().mapToInt(Integer::intValue).sum() == 0;

  }
}
