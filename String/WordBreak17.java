import java.util.HashSet;
import java.util.Set;

public class WordBreak17 {
    public static void main(String[] args) {
        int n = 12;
        String words[] = { "i", "like", "sam",
                "sung", "samsung", "mobile",
                "ice", "cream", "icecream",
                "man", "go", "mango" };
        String str = "ilikesamsung";
        Set<String> set = new HashSet<>();
        for (String string : words) {
            set.add(string);
        }
        wordBreak(set, str, "");
    }

    static void wordBreak(Set<String> words, String str, String asf) {

        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }
        String temp = "";
        for (int j = 0; j < str.length(); j++) {
            temp += str.charAt(j);

            if (words.contains(temp)) {

                wordBreak(words, str.substring(j + 1), asf + temp + " ");
            }
        }

    }
}
