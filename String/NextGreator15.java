public class NextGreator15 {
    public static void main(String[] args) {
        int a[] = { 3, 2, 1 };

        int i = a.length - 1;
        while (i-1!=-1  && a[i] < a[i - 1]) {
            i--;

        }
        if (i-1 < 0) {
            reverse(a, i , a.length - 1);
            for (int k : a) {
                System.out.println(k);
            }
            return;
        }
        i = i - 1;
        int temp = a[i];
        a[i] = a[a.length - 1];
        a[a.length - 1] = temp;
        reverse(a, i + 1, a.length - 1);
        for (int j : a) {
            System.out.println(j);
        }

    }

    static int[] reverse(int a[], int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
}
