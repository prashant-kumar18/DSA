
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 2 };
        histo(arr);
    }

    static void histo(int a[]) {
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
        System.out.println(max);

    }
}
