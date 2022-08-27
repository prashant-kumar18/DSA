import java.util.Arrays;

public class BinarySearchQues {
    public static void main(String[] args) {
        // int a[] = { 4, 5, 6, 7, 10, 1, 2, 3 };
        String a[] = { "coding", "codezen", "codingninja", "coder" };
        // int a[] = { 5, 17, 100, 11 };
        // nthRoot(9, 2);
        // duplicate(a);
        // aggresiveCows(a, 3);
        // allocateBooks(a, 4);
        // searchSingleElement(a);
        // pivot(a);
        longestCommonPrefix(a);

    }

    static void nthRoot(double num, double n) {

        double i = 1;
        double j = num;
        double eps = 1e-6;
        while ((j - i) > eps) {

            double mid = (i + j) / 2;
            double temp = root(mid, n);
            if (temp > num) {

                j = mid;
            } else {
                i = mid;
            }
        }
        System.out.println(Math.round(i));
    }

    static double root(double num, double n) {
        double ans = 1;
        for (double i = 1; i <= n; i++) {
            ans *= num;
        }
        return ans;
    }

    static void duplicate(int a[]) {
        int n = a[0];
        for (int i = 1; i < a.length; i++) {

            n ^= a[i];

        }
        System.out.println(n);
    }

    static void aggresiveCows(int a[], int cows) {
        int i = 1;
        Arrays.sort(a);
        int j = a[a.length - 1];
        int perfectDis = 0;
        while (i < j) {
            int mid = (i + j) / 2;

            if (isFeasibleAggresiveCow(a, cows, mid)) {
                i = mid + 1;
                perfectDis = mid;

            } else {
                j = mid - 1;
            }
        }
        System.out.println(perfectDis);
    }

    static boolean isFeasibleAggresiveCow(int a[], int cows, int mid) {
        int count = 1;
        int i = 1;
        int cowIndex = 0;
        while (i < a.length) {

            if (a[i] - a[cowIndex] >= mid) {
                count++;
                cowIndex = i;
            }
            i++;
        }
        return count >= cows;
    }

    static void allocateBooks(int a[], int students) {
        Arrays.sort(a);
        int i = a[0], j = getSum(a);

        int p = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (isFeasibleAllocateBooks(a, mid, students)) {
                p = mid;
                j = mid - 1;

            } else {
                i = mid + 1;
            }
        }
        System.out.println(p);
    }

    static boolean isFeasibleAllocateBooks(int a[], int maxPages, int students) {

        int sum = 0;
        int s = 1;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > maxPages) {
                s++;
                sum = a[i];
                if (sum > maxPages)
                    return false;
            }
        }
        return s <= students;
    }

    static void searchSingleElement(int a[]) {

        int i = 0, j = a.length - 1;
        int at = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a[mid] != a[mid - 1] && a[mid + 1] != a[mid]) {
                at = mid;
                System.out.println(at);
                break;
            }
            if (isFeasibleSearchSingleElement(a, mid)) {
                i = mid + 1;

            } else {
                j = mid - 1;
            }
        }
    }

    static boolean isFeasibleSearchSingleElement(int a[], int mid) {

        if (mid % 2 != 0) {
            if (a[mid - 1] == a[mid]) {
                return true;
            }

        } else {
            if (a[mid + 1] == a[mid]) {
                return true;
            }
        }
        return false;
    }

    static void searchRotated(int arr[], int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && arr[mid] >= target)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
    }

    static void pivot(int a[]) {

        int i = 0, j = a.length - 1;
        int mid = 0;
        while (i < j) {
            mid = (i + j) / 2;
            if (a[i] <= a[j]) {
                j = mid;
            } else {
                i = mid;
            }
        }
        System.out.println(mid);
    }

    static void longestCommonPrefix(String a[]) {

        int i = 0;
        int j = 0;
        int minLength = Integer.MAX_VALUE;
        String s = "";
        for (int j2 = 0; j2 < a.length; j2++) {
            minLength = Math.min(minLength, a[j2].length());
        }
        System.out.println(minLength);
        outerloop: while (j <= minLength) {

            i = 0;
            char currentLetter = a[i].charAt(j);

            while (i < a.length) {

                if (a[i].charAt(j) != currentLetter) {

                    System.out.println("break");
                    break outerloop;

                }
                i++;

            }

            s += a[0].charAt(j);
            j++;

        }
        System.out.println(s);
    }

    static int getSum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
