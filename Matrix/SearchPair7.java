public class SearchPair7 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 6, 1, 3 },
                { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 }
        };
        search(matrix);
    }

    static void search(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int c = 0, d = 0;
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    c = i;
                    d = j;
                }
                if (c > a && d > b && arr[i][j] < min) {
                    min = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }

        System.out.println(min + " " + max);
    }
}
