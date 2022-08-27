public class Rotate90Degree8 {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 3, 5 }, // 3,2,1,
                { 2, 6, 9 }, // 6,6,3,
                { 3, 6, 9 } // 9,9,5,
        };
        for (int[] is : rotate(matrix)) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
    }

    static int[][] rotate(int a[][]) {
        int i = 0;
        a = trans(a);
        while (i < a.length) {
            int l = 0;
            int r = a.length - 1;
            while (l < r) {
                int temp = a[i][l];
                a[i][l] = a[i][r];
                a[i][r] = temp;
                l++;
                r--;
            }
            i++;
        }
        return a;
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
