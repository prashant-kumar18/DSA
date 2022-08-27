public class Transpose {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 3, 5 }, // 1,2,3
                { 2, 6, 9 }, // 3,6,6
                { 3, 6, 9 } // 5,9,9
        };
        for (int[] is : trans(matrix)) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }

    }

    static int[][] trans(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {

                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        return a;
    }

}
