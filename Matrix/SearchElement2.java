public class SearchElement2 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 } };
        System.out.println(search(matrix, 17));

    }

    public static boolean search(int a[][], int target) {

        int i = 0;
        int j = a.length - 1;

        while (i <= j) {

            int mid = (i + j) / 2;

            if (target <= a[mid][0]) {
                j = mid - 1;

            } else if (target >= a[mid][a.length - 1]) {
                i = mid + 1;

            }
            if (target >= a[mid][0] && target <= a[mid][a[mid].length - 1]) {
                {

                    int row[] = a[mid];
                    int left = 0, right = a[mid].length;
                    while (left <= right) {

                        int rowmid = (left + right) / 2;
                        if (target == row[rowmid]) {
                            return true;
                        }
                        if (target < row[rowmid]) {

                            right = rowmid - 1;

                        } else if (target > row[rowmid]) {
                            left = rowmid + 1;
                        }

                    }

                }

            }
        }

        return false;
    }

}
