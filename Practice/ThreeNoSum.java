import java.util.Arrays;

public class ThreeNoSum {
    public static void main(String[] args) {
        int a[] = { -1, 0, 1, 2, -1, -4 };
        // -4,-1,-1,0,1,2
        sum(a, 0);
    }

    static void sum(int a[], int target) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            int pt1 = i + 1;
            int pt2 = a.length - 1;
            while (pt1 < pt2) {

                if (current + (a[pt1] + a[pt2]) < target) {
                    pt1++;
                } else if (current + (a[pt1] + a[pt2]) > target) {
                    pt2--;
                } else {
                    System.out.println(current + " " + a[pt1] + " " + a[pt2]);
                    pt2--;
                }
            }
        }
    }
}
