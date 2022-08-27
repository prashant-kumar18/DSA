import java.util.HashSet;

public class LongestConSeq {
    public static void main(String[] args) {
        int a[] = { 100, 99, 98, 200, 1, 3, 2, 4 };
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int i = 0;
        int streak = 0;
        while (i < a.length) {
            int current = a[i];
            if (!set.contains(current - 1)) {
                int currentStreak = 0;
                while (set.contains(current)) {
                    current++;
                    currentStreak++;
                }
                if (currentStreak > streak) {
                    streak = currentStreak;
                }
            }
            i++;
        }
        System.out.println(streak);
    }
}
