import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static boolean areIsomorphic(String str1, String str2) {
        // Your code here
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        boolean isIso = false;

        for (int i = 0; i < map1.size(); i++) {
            if (map1.get(map1.keySet()[i]) == map2.values()[i]) {
               
            }
        }

        for (char c : map1.keySet()) {
            if(map1.get(c)==map2)
        }
    }
}
