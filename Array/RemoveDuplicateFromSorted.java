public class RemoveDuplicateFromSorted {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 2, 2, 3, 4, 4 };
        int i = 0;
        for (int j = 1; j < a.length; j++) {

            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];

            }
        }
        for (int k : a) {

            System.out.println(k);
        }
    }
}
