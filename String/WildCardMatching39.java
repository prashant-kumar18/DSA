public class WildCardMatching39 {
    public static void main(String[] args) {
        String wild = "g*ks",
                pattern = "geeks";

        System.out.println(matched(wild, pattern));
    }

    static boolean matched(String wild, String pattern) {

        int i = 0, j = 0;
        while (j < pattern.length()) {
            if (wild.charAt(i) == '*') {
                if(i+1>wild.length()-1){
                    return true;
                }else
                i = i + 1;

                while (pattern.charAt(j++) != wild.charAt(i)) {

                }
                j=j-1;
                if (j > pattern.length()) {
                    return false;
                }
            } else if (wild.charAt(i) == '?') {
                j++;
                i++;
            }

            else if (wild.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                return false;
            }
        }

        return true;
    }
}
