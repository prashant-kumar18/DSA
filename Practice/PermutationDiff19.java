public class PermutationDiff19 {

  public static void main(String[] args) {
    String str = "abc";
    per(str, new int[str.length()], "", 0);
  }

  static void per(String str, int[] v, String asf, int i) {
    if (i == str.length()) {
      System.out.println(asf);
      return;
    }

    for (int j = 0; j < str.length(); j++) {
      if (v[j] == 0) {
        v[j] = 1;
        per(str, v, asf + str.charAt(j), i + 1);
        v[j] = 0;
      }
    }
  }
}
