import java.util.Arrays;

public class DPQues {

    public static void main(String[] args) {
        int[] n = {8, 1, 4, 9};
//        maxProduct(n);
        int[][] dp = new int[n.length][n.length + 1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }

        System.out.println(longestCommonSub("abcd","aced",4,4));


    }

    public static void longestIncreasingSub(int[] a) {
        int[] dp = new int[a.length];
        int omax = 0;
        for (int i = 0; i < a.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {

                if (a[j] < a[i]) {
                    if (dp[j] > max) {
                        max = dp[j];
                    }
                }

            }
            dp[i] = max + 1;
            if (omax < dp[i]) {
                omax = dp[i];
            }
        }
        System.out.println(omax);

    }

    //abcd
    //aced
    public static int longestCommonSub(String s1, String s2, int i, int j) {

        if (i == 0 || j == 0) {
            return 0;
        }
        int l1=0,l2=0;
        if (s1.charAt(i-1)==s2.charAt(j-1))
             l1= 1 + longestCommonSub(s1, s2, i - 1, j - 1);

        else
            l2= Math.max(longestCommonSub(s1,s2, i - 1, j), longestCommonSub(s1,s2, i, j - 1));
return Math.max(l1,l2);

    }

    public static void maxProduct(int[] a) {

        int cp = 1;
        int ans = 1;

        for (int i = 0; i < a.length; i++) {
            cp *= a[i];

            ans = Math.max(ans, cp);
            if (cp == 0) cp = 1;
        }
        ans = 1;
        cp = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            cp *= a[i];

            ans = Math.max(ans, cp);
            if (cp == 0) cp = 1;
        }
        System.out.println(ans);
    }
}
