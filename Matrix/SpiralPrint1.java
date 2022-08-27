class SpiralPrint1 {
    public static void main(String[] args) {
        int r = 4, c = 4,
                matrix[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        spirallyTraverse(matrix, r, c);

    }

    // Function to return a list of integers denoting spiral traversal of matrix.
    static void spirallyTraverse(int matrix[][], int r, int c) {
        // code here

        int maxi = matrix.length - 1;
        int maxj = matrix.length - 1;
        int mini = 0;
        int minj = 0;

        while (mini <= maxi && minj <= maxj) {

            for (int j = minj, i = mini; j <= maxj; j++) {
                System.out.println(matrix[i][j]);
            }
            mini += 1;

            for (int i = mini, j = maxj; i <= maxi; i++) {
                System.out.println(matrix[i][j]);
            }
            maxj -= 1;

            for (int j = maxj, i = maxi; j >= minj; j--) {
                System.out.println(matrix[i][j]);
            }
            maxi -= 1;

            for (int i = maxi, j = minj; i >= mini; i--) {
                System.out.println(matrix[i][j]);
            }
            minj += 1;
            System.out.println(mini + " " + maxi + " " + minj + " " + maxj);
        }
    }
}