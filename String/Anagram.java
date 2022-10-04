//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class Anagram {
//    public static void main(String[] args) {
//
//        String words[] = { "act", "god", "cat", "dog", "tac" };
//        ana(words);
//    }
//
//    static void ana(String s1, string s2) {
//        System.out.println(hashCode(s1) != hashCode(s2) ? 0 : 1);
//
//    }
//
//    // static void ana(String a[]) {
//    // Map<Integer, LinkedList<String>> map = new HashMap<>();
//
//    // for (int i = 0; i < a.length; i++) {
//    // int temp = hashCode(a[i]);
//    // if (map.containsKey(temp)) {
//    // LinkedList<String> l = map.get(temp);
//    // l.add(a[i]);
//    // map.put(temp, l);
//    // } else {
//    // LinkedList<String> l = new LinkedList<>();
//    // l.add(a[i]);
//    // map.put(temp, l);
//    // }
//    // }
//    // for (int i : map.keySet()) {
//    // System.out.println(map.get(i));
//    // }
//
//    // }
//
//    static int charToDigit(char character) {
//        return character - 'a' + 1;
//    }
//
//    static int hashCode(String s) {
//        int hashCode = 0;
//        int k = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//
//            hashCode += charToDigit(s.charAt(k++));
//        }
//        return hashCode;
//    }
//}
