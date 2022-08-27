import java.util.HashMap;
public class SmallestWindow {// aquire and release :- acquire until get all the letter from target and start
                             // relasing when till get the actual count less then neededmatch
    public static void main(String[] args) {
        String s = "timetopractice",
                t = "toc";
        System.err.println(window(s, t));
    }

    static String window(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int neededMatch = t.length();
        int actualMatch = 0;
        int j = 0;
        String result="";
        while (i < s.length()) {

            while (actualMatch < neededMatch) {
                char ch = t.charAt(i);
                if (map1.containsKey(ch)) {
                    map2.put(ch, map2.getOrDefault(ch,0) + 1);
                    actualMatch += 1;

                }
                s+=ch;
                i++;
            }
            while (actualMatch == neededMatch) {
                char ch = t.charAt(j);

                if (map1.containsKey(ch)) {
                    if (map2.get(ch) >= map1.get(ch)) {
                        if (map2.get(ch) == 1) {
                            map2.remove(ch);
                        } else
                            map2.put(ch, map2.get(ch) - 1);

                    }
                    if(!map2.containsKey(ch)|| map2.get(ch) < map1.get(ch)){
                        actualMatch-=1;
                    }
                }else{
                     if (map2.get(ch) == 1) {
                            map2.remove(ch);
                        } else
                            map2.put(ch, map2.get(ch) - 1);

                    }
                }
                result=result.substring(j+1);
                j++;
            }

        

    return result;
}}
