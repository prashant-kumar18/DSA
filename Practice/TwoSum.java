import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 3 };
        int target = 7;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {

            if (set.contains(target - a[i])) {
                System.out.println(target-a[i] + " " + a[i]);
            } else {
                set.add(a[i]);
            }
        }
    }
}
