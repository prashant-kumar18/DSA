public class CountWord7 {
    public static void main(String[] args) {
        char a[][] = {
                { 'D', 'D', 'D', 'G', 'D', 'D' },
                { 'B', 'B', 'D', 'E', 'B', 'S' },
                { 'B', 'S', 'K', 'E', 'B', 'K' },
                { 'G', 'D', 'G', 'D', 'D', 'E' },
                { 'E', 'D', 'D', 'D', 'D', 'E' },
                { 'E', 'K', 'D', 'D', 'D', 'G' }
        };
        String str = "GEEKS";
        int total = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == str.charAt(0)) {
                    total += count(a, str, i, j, 0);
                }

            }
        }

        System.out.println(total);
    }

    static int count(char a[][], String s, int i, int j, int k) {
        if (i > a.length - 1 || j > a[0].length - 1 || i < 0 || j < 0 || k > s.length() - 1) {
            return 0;
        }
        if (k == s.length() - 1 && a[i][j] == s.charAt(k)) {

            return 1;
        }

        if (a[i][j] != s.charAt(k)) {

            return 0;
        }

        int x = 0;

        x += count(a, s, i + 1, j, k + 1);
        x += count(a, s, i - 1, j, k + 1);
        x += count(a, s, i, j + 1, k + 1);
        x += count(a, s, i, j - 1, k + 1);

        return x;

    }
}
