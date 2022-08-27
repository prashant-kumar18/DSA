public class SentenseMake43 {
    public static void main(String[] args) {
        String[][] a = { { "you", "we" },
                { "have", "are" },
                { "sleep", "eat", "drink" } };

        make(a, 0, 0, "");
    }

    static void make(String a[][], int i, int j, String s) {
        if (i == a.length) {
            System.out.println(s);
            return;
        }
        if (i > a.length - 1 || j > a[i].length - 1) {
            return;
        }

        for (int j2 = 0; j2 < a[i].length; j2++) {
            make(a, i + 1, j2, s + a[i][j2] + " ");
        }

    }
}
