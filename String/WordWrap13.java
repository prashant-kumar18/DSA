public class WordWrap13 {
    public static void main(String[] args) {
        int a[] = { 3, 2, 1,5 };
wrap(a, 0, "", 6);
    }

    static void wrap(int a[], int i, String word, int k) {

        if (k <= 0) {
            System.out.println(word);
            return;
        }

        for (int j = i; j < a.length; j++) {
            wrap(a, i + 1, word + a[i], k - a[i] + 1);
        }
    }
}
