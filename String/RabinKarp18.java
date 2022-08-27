public class RabinKarp18 {
    public static void main(String[] args) {

        String s = "this is the test text";
        String search = "t";
        double searchHashCode = hashCode(search);
        int sl = search.length() - 1;

        double curHashCode = hashCode(s.substring(0, search.length()));

        for (int i = 0; i < s.length(); i++) {
        if (searchHashCode == curHashCode) {
        System.out.println(i);
        }
        if (i + sl+1 < s.length()) {
      
        curHashCode = (curHashCode - charToDigit(s.charAt(i)) * Math.pow(31, sl))
        * 31 + charToDigit(s.charAt(i + sl+1));
        }

        }

    }

    static int charToDigit(char character) {
        return character - 'a' + 1;
    }

    static int hashCode(String s) {
        int hashCode = 0;
        int k = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            hashCode += charToDigit(s.charAt(k++)) * Math.pow(31, i);
        }
        return hashCode;
    }
}
