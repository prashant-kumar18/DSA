public class InversionMergeSort {
    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 3, 1 };

        System.out.println(mergeSort(a, 0, a.length - 1));
        for (int i = 0; i < a.length; i++) {
            System.err.print(a[i]);
        }
    }

    public static int mergeSort(int a[], int i, int j) {
        int m, inver = 0;
        if (i < j) {
            m = (i + j) / 2;

            inver += mergeSort(a, i, m);
            inver += mergeSort(a, m + 1, j);
            inver += merge(a, i, m, m + 1, j);

        }
        return inver;

    }

    public static int merge(int a[], int l1, int r1, int l2, int r2) {
        int b[] = new int[a.length];
        int k = l1;
        int left = l1;
        int right = r2;
        int inver = 0;
        while (l1 <= r1 && l2 <= r2) {
            if (a[l1] <= a[l2]) {
                b[k] = a[l1];
                l1++;

            } else {
                b[k] = a[l2];
                System.out.println(a[l1] + " " + a[l2]);
                if (a[l1] > (2 * a[l2])) {

                    inver = inver + ((r1 + 1) - l1);
                }
                l2++;
            }
            k++;
        }
        while (l1 <= r1) {
            b[k++] = a[l1++];
        }
        while (l2 <= r2) {
            b[k++] = a[l2++];
        }
        for (int x = left; x <= right; x++)
            a[x] = b[x];
        return inver;
    }
}
