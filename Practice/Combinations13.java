public class Combinations13 {
    public static void main(String[] args) {
        String str = "aaaabbaac";
        System.out.println(combination(str, 0, ""));
    }

    static int combination(String str, int i, String asf) {
        if (i == str.length()) {
            System.out.println(asf);
            if (asf.length() == 2) {
                return 1;

            }
            return 0;
        }
        char ch = str.charAt(i);
        int n = combination(str, i + 1, asf);
        int y = combination(str, i + 1, asf + ch);

        return n + y;
    }
}
