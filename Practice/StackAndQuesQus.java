import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackAndQuesQus {
    public static void main(String[] args) {
        // String str = "( ) { } ( ) ]";
        // balanced(str);

        int a[] = { 100, 80, 60, 70, 60, 75, 85 };
        // int a[][] = {

        // { 0, 0, 1, 0 },
        // { 1, 1, 1, 0 },
        // { 0, 0, 0, 0 },
        // { 1, 0, 1, 0 },

        // };
        // nextSmaller(a);
        // LRU l = new LRU(3);
        // l.add(1);
        // l.add(2);
        // l.add(3);
        // l.add(4);
        // l.add(5);
        // l.get(3);
        // l.print();
        // l.recent();
        // largestRecHistogram(heights);
        // slidingWindowMaxAlt(a, 3);
        // MinStack m = new MinStack();
        // m.push(5);
        // m.push(1);
        // m.push(-1);
        // m.push(1);

        // m.pop();
        // m.pop();
        // System.out.println(m.min());
        // celebrity(a);
        stockSpan(a);

    }

    static void balanced(String str) {
        Stack<Character> s = new Stack<>();
        boolean notEmpty = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else if (s.empty()) {
                notEmpty = false;
                break;
            } else if (s.peek() == oppparanthesis(ch)) {
                System.out.println(ch);
                s.pop();
            }
        }

        System.out.println(s.empty() && notEmpty ? true : false);
    }

    static char oppparanthesis(char ch) {
        switch (ch) {
            case ')':

                return '(';
            case ']':

                return '[';
            case '}':

                return '{';

            default:
                return '_';
        }

    }

    public static void nextGreator(int[] a) {
        int n = a.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= a[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false)
                    nge[i] = st.peek();
                else
                    nge[i] = -1;
            }

            st.push(a[i % n]);

        }
        for (Integer integer : nge) {
            System.out.println(integer);
        }
    }

    static void sort(Stack<Integer> s) {
        if (s.size() == 0) {
            return;
        }
        int x = s.pop();
        sort(s);
        insertAtCorrect(s, x);

    }

    static void insertAtCorrect(Stack<Integer> s, int x) {

        if (s.size() == 0 || s.peek() < x) {
            s.push(x);
        } else {
            int y = s.pop();
            insertAtCorrect(s, x);
            s.push(y);
        }
    }

    public static void nextSmaller(int[] a) {

        Stack<Integer> s = new Stack<>();
        int ngi[] = new int[a.length];
        int n = a.length;
        for (int i = 2 * a.length - 1; i >= 0; i--) {
            while (s.size() != 0 && s.peek() >= a[i % n]) {
                s.pop();
            }
            if (s.size() == 0) {
                ngi[i % n] = -1;
            } else {
                ngi[i % n] = s.peek();

            }
            s.push(a[i % n]);
        }
        for (Integer integer : ngi) {
            System.out.println(integer);
        }
    }

    static void largestRecHistogram(int[] heights) {

        int leftMin[] = new int[heights.length];
        int rightMin[] = new int[heights.length];

        Stack<Integer> s = new Stack<>();

        for (int i = heights.length - 1; i >= 0; i--) {

            while (s.size() != 0 && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.size() == 0) {
                rightMin[i] = heights.length;
            } else {
                rightMin[i] = s.peek();
            }
            s.push(i);
        }
        s.clear();
        for (int i = 0; i < heights.length; i++) {

            while (s.size() != 0 && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.size() == 0) {
                leftMin[i] = -1;
            } else {
                leftMin[i] = s.peek();
            }
            s.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {

            int temp = ((rightMin[i] - leftMin[i]) - 1) * heights[i];

            if (temp > maxArea) {
                maxArea = temp;
            }
        }
        System.out.println(maxArea);

    }

    static void slidingWindowMax(int a[], int k) {
        Deque<Integer> d = new ArrayDeque<>();

        int max[] = new int[a.length - k + 1];

        for (int i = 0; i < k; i++) {
            while (d.size() != 0 && a[d.peekLast()] <= a[i]) {
                d.removeLast();
            }
            d.addLast(i);

        }

        max[0] = a[d.peekFirst()];
        int index = 1;
        for (int i = k; i < a.length; i++) {

            if (d.peekFirst() < index) {
                d.removeFirst();
            }
            while (d.size() != 0 && a[d.peekLast()] <= a[i]) {
                d.removeLast();
            }

            d.addLast(i);

            max[index] = a[d.peekFirst()];

            index++;

        }

        for (int i : max) {
            System.out.println(i);
        }

    }

    static void slidingWindowMaxAlt(int a[], int k) {
        Stack<Integer> s = new Stack<Integer>();

        int ngi[] = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {

            while (s.size() != 0 && a[s.peek()] <= a[i]) {
                s.pop();
            }
            if (s.size() == 0) {
                ngi[i] = a.length;
            } else {
                ngi[i] = s.peek();
            }

            s.push(i);

        }
        for (int i = 0; i < ngi.length - k + 1; i++) {
            int temp = i;
            while (ngi[temp] < i + k) {
                temp = ngi[temp];
            }
            System.out.println(a[temp]);
        }

    }

    static void stockSpan(int a[]) {

        int previousGreator[] = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < previousGreator.length; i++) {

            while (s.size() != 0 && a[i] >= a[s.peek()]) {
                s.pop();
            }

            if (s.size() == 0) {
                previousGreator[i] = -1;

            } else {
                previousGreator[i] = s.peek();
            }
            s.push(i);
        }

        for (int i = 0; i < previousGreator.length; i++) {
            System.out.print(i - previousGreator[i]);
        }
    }

    static void celebrity(int a[][]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            s.push(i);
        }
        while (s.size() != 1) {

            int n1 = s.pop();
            int n2 = s.pop();

            if (a[n1][n2] == 1) {
                s.push(n2);
            } else {
                s.push(n1);
            }
        }
        int i = 0;
        boolean isCelebrity = true;
        while (i < a.length) {
            if (a[s.peek()][i] == 1 && i != s.peek()) {
                isCelebrity = false;
            }
            i++;
        }
        i = 0;
        while (i < a.length) {
            if (a[i][s.peek()] == 0 && i != s.peek()) {
                isCelebrity = false;
            }
            i++;
        }
        System.out.println(isCelebrity ? s.peek() : " no celebrity");

    }
}

class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> minStack;

    MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    void push(int n) {
        if (stack.size() == 0) {

            minStack.push(n);
        } else {
            if (n < minStack.peek()) {
                minStack.push(n);
            } else {
                minStack.push(minStack.peek());
            }
        }
        stack.push(n);
    }

    void pop() {
        stack.pop();
        minStack.pop();
    }

    int min() {
        return minStack.peek();
    }

    void print() {
        for (Integer integer : stack) {
            System.out.print(integer);
        }
        System.out.println();
    }
}

class LRU {
    public Stack<Integer> s;
    public int size;

    LRU(int size) {
        this.size = size;
        s = new Stack<>();
    }

    boolean getHelper(int n) {
        boolean isPresent = false;
        if (s.size() == 0) {
            System.out.println("not found");
            return false;
        } else if (s.peek() == n) {
            s.pop();
            return true;
        } else {
            int x = s.pop();
            isPresent = getHelper(n);
            s.push(x);

        }
        return isPresent;
    }

    void get(int n) {
        if (getHelper(n))
            s.push(n);
    }

    void add(int n) {

        if (s.size() < size) {

            s.push(n);
        } else {
            removeLast();
            s.push(n);
        }
    }

    void removeLast() {

        if (s.size() == 1) {
            s.pop();
            return;
        }
        int x = s.pop();
        removeLast();
        s.push(x);
    }

    int recent() {
        return s.peek();
    }

    void print() {
        for (Integer integer : s) {
            System.out.print(integer + " ");
        }
    }
}