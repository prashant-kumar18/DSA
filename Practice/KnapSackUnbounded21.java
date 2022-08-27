public class KnapSackUnbounded21 {
    public static void main(String[] args) {
        int val[] = { 10, 20, 30, 90};
        int wt[] = { 1, 1, 1, 1 };
        int w = 4;

        System.out.println(knapsack(wt, val, -1, w));
    }

    static int knapsack(int wt[], int val[], int i, int w) {
        if (w == 0) {
            return 0;
        } else if (i > wt.length - 2) {
            return 0;
        } else if (wt[i+1] > w) {
            knapsack(wt, val, i + 1, w);
        }
        int y = val[i+1] + knapsack(wt, val, i, w - wt[i+1]);
        int x = knapsack(wt, val, i + 1, w);

        return (x > y) ? x : y;
    }
}
