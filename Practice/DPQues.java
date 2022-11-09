import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DPQues {

    static int count = 0;
    static HashSet<String> set = new HashSet<>(Arrays.asList("i", "mobile", "like"));

    public static void main(String[] args) {
        int[] n = {2, 5, 7, 8, 10};
        int[] wt = {1, 2, 4, 5};
        int[] val = {5, 4, 8, 6};
        char[] a1 = {'r', 'o', 's'};
        char[] a2 = {'h', 'o', 'r', 's', 'e'};
//        maxProduct(n);
        int[][] dp = new int[10 + 1][2 + 1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }


        System.out.println((4 + 6) % 10);
//        jobSeq();
    }

    public static void jobSeq() {
        System.out.println(9 % 10);
    }

    static int palindromePartition(String s, String asf) {
        if (s.length() == 0) {
            System.out.println("[" + asf + "]");
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(0, i + 1);
            if (isPalin(temp)) {
                return 1 + palindromePartition(s.substring(i + 1), asf + "(" + temp + ")");
            }
        }
        return 0;
    }

    static boolean isPalin(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;
    }

    public static boolean wordBreak(String s) {

        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(0, i + 1);
            if (set.contains(temp))
                return wordBreak(s.substring(i + 1));
        }

        return false;
    }

    public static int eggDroping(int tFloor, int tEgg, int[][] dp) {
        count++;
        if (tFloor == 1 || tFloor == 0 || tEgg == 1) {
            return tFloor;
        }
        if (dp[tFloor][tEgg] != -1) {
            return dp[tFloor][tEgg];
        }
        int l1;
        int bestOfWorst = Integer.MAX_VALUE;
        for (int i = 1; i <= tFloor; i++) {
            l1 = 1 + Math.max(eggDroping(i - 1, tEgg - 1, dp), eggDroping(tFloor - i, tEgg, dp));
            bestOfWorst = Math.min(bestOfWorst, l1);
        }
        return dp[tFloor][tEgg] = bestOfWorst;
    }

    public static void rodCutTab(int[] a, int target) {
        int[][] dp = new int[a.length + 1][target + 1];
        for (int i = 1; i < dp.length; i++) {
            int l1 = 0, l2 = 0;
            for (int j = 1; j < dp[0].length; j++) {
                if (i <= j) {
                    l1 = a[i - 1] + dp[i - 1][j - i];
                }
                l2 = dp[i - 1][j];

                dp[i][j] = Math.max(l1, l2);
            }
        }
        System.out.println(dp[dp.length - 1][dp[0].length - 1]);
    }

    public static int rodCut(int[] a, int i, int target) {

        if (i <= 0 || target < 0 || target == 0) {
            return 0;
        }
        int l1 = 0, l2 = 0;
        if (i <= target) l1 = a[i - 1] + rodCut(a, i - 1, target - i);
        l2 = rodCut(a, i - 1, target);
        return Math.max(l1, l2);
    }

    public static void subsetSumTab(int[] a, int target) {
        boolean[][] dp = new boolean[a.length + 1][target + 1];
        dp[0][0] = true;
        for (int i = 1; i < dp.length; i++) {
            boolean l1 = false, l2 = false;
            for (int j = 0; j < dp[0].length; j++) {
                if (j == 0) {
                    dp[i][j] = true;
                    continue;
                }
                if (a[i - 1] <= j) {
                    l1 = dp[i - 1][j - a[i - 1]];

                }
                l2 = dp[i - 1][j];
                dp[i][j] = l1 || l2;
            }
        }
        System.out.println(dp[dp.length - 1][dp[0].length - 1]);
    }

    public static boolean subsetSum(int[] a, int i, int target) {
        if (target == 0) return true;
        if (i < 0 || target < 0) return false;
        boolean l1 = false, l2 = false;
        if (a[i] <= target) l1 = subsetSum(a, i - 1, target - a[i]);
        l2 = subsetSum(a, i - 1, target);
        return l1 || l2;
    }

    public static void coinChangeTab(int[] a, int target) {

        int[][] dp = new int[a.length + 1][target + 1];
        for (int i = 1; i < dp.length; i++) {
            int l1 = 0, l2 = 0;
            for (int j = 0; j < dp[0].length; j++) {
                if (j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                if (a[i - 1] <= j) {
                    l1 = dp[i][j - a[i - 1]];

                }
                l2 = dp[i - 1][j];
                dp[i][j] = l1 + l2;
            }
        }

        System.out.println(dp[dp.length - 1][dp[0].length - 1]);
    }

    public static int coinChange(int[] a, int i, int target, int[][] dp) {
        if (target == 0) {
            return 1;
        }
        if (i < 0 || target < 0) {
            return 0;
        }
        if (dp[i][target] != -1) return dp[i][target];
        int l1 = 0, l2 = 0;
        if (a[i] <= target) l1 = coinChange(a, i, target - a[i], dp);

        l2 = coinChange(a, i - 1, target, dp);

        return dp[i][target] = l1 + l2;
    }

    //5,1,2,8
    public static int maxSumIncSub(int[] a, int prev, int cur) {
        int l1 = 0;
        int l2 = 0;
        if (cur > a.length - 1) {
            return 0;
        }
        if (prev == -1 || a[prev] < a[cur]) {

            l1 = a[cur] + maxSumIncSub(a, cur, cur + 1);
        } else {
            l2 = maxSumIncSub(a, prev, cur + 1);
        }

        return Math.max(l1, l2);
    }

    public static void maxSumIncSubTab(int[] a) {
        int[] dp = new int[a.length];
        int totalSum = 0;
        dp[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            int cur = 0;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && cur < dp[j]) {
                    cur = dp[j];
                }
            }
            dp[i] = cur + a[i];
            totalSum = Math.max(totalSum, dp[i]);
        }
        System.out.println(totalSum);
    }

    //horse //ros
    static int editDis(int[] a1, int[] a2, int i, int j) {
        if (i < 0) {
            return j + 1;
        }
        if (j < 0) {
            return i + 1;
        }
        if (a1[i] == a2[j]) return editDis(a1, a2, i - 1, j - 1);//if equal
        else {

            return 1 + Math.max(Math.max(editDis(a1, a2, i, j - 1),//insert
                            editDis(a1, a2, i - 1, j)//delete
                    ), editDis(a1, a2, i - 1, j - 1)//replace
            );


        }
    }

    static int editDisTabluation(char[] a1, char[] a2) {

        int[][] dp = new int[a1.length + 1][a2.length + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (a1[i - 1] == a2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]);
                }
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }

    static int knapSack01(int w, int[] wt, int[] val, int i) {
        // Base Case
        if (i == 0 || w == 0) return 0;
        int l1 = 0, l2 = 0;
        if (wt[i - 1] <= w) l1 = val[i - 1] + knapSack01(w - wt[i - 1], wt, val, i - 1);
        l2 = knapSack01(w, wt, val, i - 1);
        return Math.max(l1, l2);
    }

    //abcd
    //aced
    public static void longestCommonSub(String s1, String s2) {

        int[][] dp = new int[s1.length() + 1][s1.length() + 1];

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        System.out.println(dp[s1.length()][s2.length()]);
    }

    static void knapsack01Tab(int[] wt, int[] val, int w) {
        int[][] dp = new int[wt.length + 1][w + 1];
        for (int i = 1; i < dp.length; i++) {
            int l1 = 0, l2 = 0;
            for (int j = 1; j < dp[0].length; j++) {
                if (wt[i - 1] <= j) {
                    l1 = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                }
                l2 = dp[i - 1][j];
                dp[i][j] = Math.max(l1, l2);
            }
        }
        System.out.println(dp[dp.length - 1][dp[0].length - 1]);
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


    class Job {
        int id;
        int wt;
        int val;

        Job(int id, int wt, int val) {
            this.id = id;
            this.wt = wt;
            this.val = val;
        }
    }
}
