import java.util.HashMap;
import java.util.Map;

public class ShuffleTwoString6 {
    public static void main(String[] args) {
        String s1 = "abca";
        String s2 = "12";
        System.out.println(Shuffel("aabc21", s1, s2));

    }

    static boolean Shuffel(String s, String s1, String s2) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.getOrDefault(c, 0) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }

            }

        }

        return map.size() == 0 ? true : false;
    }
}
