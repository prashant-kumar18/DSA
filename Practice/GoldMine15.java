public class GoldMine15 {

    public static void main(String[] args) {
        int a[][] = {
                { 1, 3, 1, 5 },
                { 2, 2, 4, 1 },
                { 5, 0, 2, 3 },
                { 0, 6, 1, 2 },
        };
        for (int i = 0; i < a.length; i++) {
            System.out.println(goldmine(a, i, 0, 0));
        }

    }

    static int goldmine(int a[][], int i, int j, int sum) {
        if (i < 0 || j < 0 || i > a.length - 1 || j > a[0].length - 1) {
            return sum;
        }

        int x = goldmine(a, i - 1, j + 1, sum + a[i][j]);
        int y = goldmine(a, i, j + 1, sum + a[i][j]);
        int z = goldmine(a, i + 1, j + 1, sum + a[i][j]);

        return (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
    }
}
