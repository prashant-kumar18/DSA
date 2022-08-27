import java.util.Stack;

public class maxRectangle6 {
    public static void main(String[] args) {
        int a[][] = { { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 } };
        max(a);
    }

    static void max(int a[][]) {
        int max = histo(a[0]);
        for (int i = 1; i < a.length; i++) {

            int curRow[] = a[i];
            for (int j = 0; j < a.length; j++) {
                if (curRow[j] == 1 && a[i - 1][j] >= 1) {
                    curRow[j] = a[i - 1][j] + 1;
                }

            }

            for (int j : curRow) {
                System.out.print(j);
            }
            System.out.println();
            int curMax = histo(curRow);
            if (curMax > max) {
                max = curMax;
            }
        }
        System.out.println(max);
    }

    static int histo(int a[]) {
        int rse[] = new int[a.length];
        int lse[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.add(a.length - 1);
        rse[a.length - 1] = a.length;
        for (int i = a.length - 2; i >= 0; i--) {

            while (st.size() > 0 && a[i] <= a[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rse[i] = a.length;
                st.add(i);
            } else {
                rse[i] = st.peek();
                st.add(i);
            }

        }
        st.clear();
        st.add(0);
        lse[0] = -1;
        for (int i = 1; i < a.length; i++) {

            while (st.size() > 0 && a[i] < a[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                lse[i] = -1;
                st.add(i);
            } else {
                lse[i] = st.peek();
                st.add(i);
            }

        }
        int max = 0;

        for (int i = 0; i < lse.length; i++) {
            int curWidth = rse[i] - lse[i] - 1;
            int area = a[i] * curWidth;
            if (area > max) {
                max = area;
            }
        }
        return max;

    }

}
