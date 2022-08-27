import java.util.Arrays;

public class MedianInSorted3 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5 },
                { 2, 6, 9 },
                { 3, 6, 9 } };
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
        int counter = 0;
        int median = (matrix.length * matrix[0].length) / 2;
        for (int[] is : matrix) {
            for (int is2 : is) {
                if (counter == median)

                    counter++;
            }

        }
    }

    static int[] sort(int a[]) {
        Arrays.sort(a);

        return a;
    }
}
