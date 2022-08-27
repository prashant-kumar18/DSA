public class RotaionOfString5 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cab";
        boolean isRoatated = false;
        for (int i = 0; i < s1.length(); i++) {
            String temp = rotate(s1);
            if (s2.equals(temp)) {
                isRoatated = true;
                break;
            }
            s1 = temp;
        }
        System.out.println(isRoatated);

    }

    static String rotate(String s) {

        String newString = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
        return newString;
    }
}
