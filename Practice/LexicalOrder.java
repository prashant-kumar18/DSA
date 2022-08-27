public class LexicalOrder {
    public static void main(String[] args) {
        // from 1-100
        for (int i = 1; i <= 9; i++) {
            lexi(i);
        }
    }

    static void lexi(int i) {

        if (i > 100) {
            return;
        } else {
            System.out.println(i);
        }
        for (int j = 0; j <= 9; j++) {

            lexi(i * 10 + j);

        }

    }
}
