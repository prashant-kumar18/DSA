import java.util.LinkedList;

class ToWord7 {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        int n = 332221;
        while (n > 0) {
            System.out.println(n);
            l.add(n % 10);
            n /= 10;
        }
        int count = 1;
        int cur = l.get(0);

        String str = "";
        for (int i = 1; i < l.size(); i++) {

            if (l.get(i - 1) == l.get(i)) {
                count++;
                if (i == l.size() - 1) {
                    str = toWord(count) + " " + cur + "'s, " + str;
                }

            } else {
                str = toWord(count) + " " + cur + "'s, " + str;
                cur = l.get(i);
                count = 1;

            }
        }

        System.out.println(Integer.valueOf("12211"));

    }

    static String toWord(int num) {
        switch (num) {
            case 1:
                return "one";

            case 2:
                return "two";

            case 3:
                return "Three";

            case 4:
                return "four";

            case 5:
                return "five";

            case 6:
                return "six";

            case 7:
                return "seven";

            case 8:
                return "eight";

            case 9:
                return "nine";
            default:
                return "";

        }
    }
}