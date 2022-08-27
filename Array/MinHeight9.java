package Programs;
import java.util.Arrays;

public class MinHeight9 {
    public static void main(String[] args) {
        int a[]={2 ,6 ,3 ,4 ,7 ,2 ,10 ,3 ,2 ,1};
       getMinDiff(a, a.length, 5);
    }
    
   static void getMinDiff(int[] arr, int n, int k) {
        // code her
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int start = arr[0] + k;
        int end = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] >= k) {
                int x = Math.max(arr[i] + k, end);
                int y = Math.min(arr[i + 1] - k, start);
                System.out.println("x="+x+" y="+y);
                if (x - y < ans)
                    ans = x - y;
            }
        }

        System.out.println( ans);
    }
}
