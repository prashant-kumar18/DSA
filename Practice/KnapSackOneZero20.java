public class KnapSackOneZero20 {
    public static void main(String[] args) {
        int val[] = { 10, 20, 30 };
        int wt[] = { 1, 1, 1 };
        int w = 2;

        System.out.println(knapsack(wt, val, 0, w, 0));
    }

    static int knapsack(int wt[], int val[], int i, int w, int v) {
        if (w == 0) {

            return v;
        } else if (i > wt.length - 1)
            return Integer.MAX_VALUE;
        else if (wt[i] > w)
            return knapsack(wt, val, i + 1, w, v);
        int y = knapsack(wt, val, i + 1, w, v);
        int x = knapsack(wt, val, i + 1, w - wt[i], v + val[i]);
        return (x < y) ? x : y;

    }
}
