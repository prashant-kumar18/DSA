import java.util.Arrays;

public class RevPair {
    public static void main(String[] args) {
        int a[] = { 1, 0, -1, 0, -2, 2 };
        String h = "hel";
        String h1 = "hel";
        System.out.println(h == h1);
        // quad(a, 0);
    }

    static int rev(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] > 2 * (double) nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    static void quad(int a[], int n) {

        Arrays.sort(a);// -2,-1,0,0,1,2
        int i = 0, sum = 0;

        while (i < a.length) {
            String s = "";
            sum = 0;
            for (int j = i; j < 4; j++) {
                sum += a[j];
                s += a[j] + " ";
            }
            // System.out.println(sum);

            if (0 <= sum && sum <= n) {
                System.out.println(s);
                i++;
            } else if (sum < 0) {
                i++;
            }
        }
    }

}