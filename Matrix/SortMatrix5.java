import java.util.Arrays;

public class SortMatrix5 {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int a[][] = sortedMatrix(matrix);
        for (int[] is : a) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }
        ;
    }

    static int[][] sortedMatrix(int matrix[][]) {
        for (int t = 0; t < 2; t++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                int a1[] = matrix[i];
                int a2[] = matrix[i + 1];
                int k1 = 0;
                int k2 = 0;

                while (k1 < a1.length && k2 < a2.length) {
                    if (a1[k1] <= a2[k2]) {
                        k1++;
                    } else {
                        int temp = a1[k1];
                        a1[k1] = a2[k2];
                        a2[k2] = temp;
                        sort(a2);

                    }
                }
            }
        }

        return matrix;
    }

    static int[] sort(int a[]) {
        Arrays.sort(a);

        return a;
    }
}
