import java.util.LinkedList;
import java.util.List;

public class Arrange {
    public static void main(String[] args) {

        System.out.println(solution("is3 this2 4the rona2ldo 5best"));
    }

    static String solution(String s1) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                count++;

            }

        }

        String a[] = new String[count];
        String str = "";
        int temp = 0;
        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {

                temp = Character.getNumericValue(s1.charAt(i));

                continue;

            }
            if (i == s1.length() - 1) {

                a[temp - 1] = str + s1.charAt(i);
            }
            if (s1.charAt(i) == ' ') {
                a[temp - 1] = str;
                str = "";
                continue;
            } else {
                str += s1.charAt(i);
            }

        }
        str = "";

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                str += a[i];
            } else
                str += a[i] + " ";
        }

        return str;
    }
}
