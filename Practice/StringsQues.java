public class StringsQues {
    public static void main(String[] args) {
        // reverse(" hello world ");
        // longestPalin("abccbc");
        atoiFun("-11");
    }

    static void reverse(String s) {

        s = s.trim();
        int j = s.length() - 1;
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) == ' ') {
                continue;
            }
            if (s.charAt(i) == ' ' || i == 0) {
                if (i == 0) {
                    r += s.substring(i, j + 1);
                } else {
                    r += s.substring(i + 1, j + 1) + " ";
                }

                j = i - 1;
            }
        }
        System.out.println("|" + r + "|");
    }

    static void longestPalin(String s) {
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String temp = s.substring(i, j + 1);
                if (isPalin(temp)) {
                    if (max < temp.length()) {
                        max = temp.length();
                        ans = temp;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    static boolean isPalin(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;
    }

    static void atoiFun(String s) {
        int totalNo = 0;
        boolean isNegative = false;
        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (s.charAt(i) == '-' && Character.getNumericValue(s.charAt(i + 1)) >= 0 && Character
                    .getNumericValue(s.charAt(i + 1)) <= 10) {

                isNegative = true;
            }
            if (num >= 0 && num <= 9) {

                totalNo = totalNo * 10 + num;
            }

        }
        System.out.println(isNegative ? -1 * totalNo : totalNo);

    }
}
