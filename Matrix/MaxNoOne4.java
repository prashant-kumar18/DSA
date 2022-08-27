public class MaxNoOne4 {
    public static void main(String[] args) {
        int a[][] = { { 0, 1, 1, 1 },
                { 0, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };

    }

    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max = 0;
        int maxRow = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxRow = i;
            }
        }
        return maxRow;
    }
}
