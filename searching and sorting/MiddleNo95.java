import java.util.PriorityQueue;

public class MiddleNo95 {
    public static void main(String[] args) {
        int a = 2, b = 1, c = 3;

        PriorityQueue<Integer> p = new PriorityQueue<>((i, j) -> j - i);
        p.add(a);
        p.add(b);
        p.add(c);
        p.poll();
        System.out.println(p.peek());
    }

}