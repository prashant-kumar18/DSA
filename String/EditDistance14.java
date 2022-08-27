public class EditDistance14 {
    public static void main(String[] args) {
        String word1 = "hors", word2 = "ros";
        // convert word1 to word2 by using below operations

        System.out.println(word(word1, word2, word1.length() - 1, word2.length() - 1));

    }

    static int word(String word1, String word2, int i, int j) {

        if (i < 0) {
            return j + 1;
        }
        if (j < 0) {
            return i + 1;
        }

        if (word1.charAt(i) == word2.charAt(j)) {
            return word(word1, word2, i - 1, j - 1);
        }

        int x = 1 + word(word1, word2, i, j - 1); // insert
        int y = 1 + word(word1, word2, i - 1, j); // delete
        int z = 1 + word(word1, word2, i - 1, j - 1); // replace
        return Integer.min(x, Integer.min(y, z));
    }
}
