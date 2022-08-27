import java.util.Arrays;

public class JobSeq {
    public static void main(String[] args) {
        int jobs[][] = { { 1, 4, 20 }, { 2, 1, 10 }, { 3, 1, 40 }, { 4, 1, 30 } };

        job(jobs);
    }

    static void job(int a[][]) {
        Arrays.sort(a, (b, c) -> c[2] - b[2]);

        int maxDeadLine = 0;
        int currentDeadline = 0;
        for (int i = 0; i < a.length; i++) {
            currentDeadline = a[i][1];
            if (maxDeadLine < currentDeadline) {
                maxDeadLine = currentDeadline;
            }
        }
        int jobStore[] = new int[maxDeadLine];
        int profit = 0;
        for (int i = 0; i < a.length; i++) {
            int deadLine = a[i][1] - 1;
            while (deadLine != -1 && jobStore[deadLine] != 0) {
                deadLine--;
            }
            if (deadLine != -1 && jobStore[deadLine] == 0) {
                jobStore[deadLine] = 1;
                profit += a[i][2];
            }

        }

        for (int[] is : a) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }

        System.out.println(profit);
    }
}
