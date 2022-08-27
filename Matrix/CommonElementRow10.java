public class CommonElementRow10 {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 1, 4, 8 },
                { 3, 7, 8, 5, 1 },
                { 8, 7, 7, 3, 1 },
                { 8, 1, 2, 7, 9 },
        };
        for (int i = 0; i < matrix[0].length; i++) {
            common(matrix, matrix[0][i], 1);
        }
       

    }

    static void common(int a[][], int cur, int i) {
        if (i == a.length) {
            System.out.println(cur);
            return;
        }

        for (int j = 0; j < a[0].length; j++) {
            if (a[i][j] == cur)
                common(a, cur, i + 1);
        }

    }
}
