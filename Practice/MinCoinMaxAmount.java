import java.util.Arrays;

public class MinCoinMaxAmount {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };

        coins(a, 71);
    }

    static void coins(int a[], int target) {

        Arrays.sort(a);
        int currentSum = 0;
        String s = "";
        for (int i = a.length - 1; i >= 0; i--) {
            while (currentSum + a[i] <= target) {
                currentSum += a[i];
                s += a[i] + " ";
            }
            if (currentSum == target) {
                System.out.println(s);
                break;
            }
        }
    }
}
