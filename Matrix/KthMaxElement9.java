import java.util.PriorityQueue;

public class KthMaxElement9 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5 },
                { 2, 6, 9 },
                { 3, 6, 9 } };
        kth(matrix);
    }

    static void kth(int a[][]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                pq.add(a[i][j]);
            }
        }

        System.out.println(pq.toArray()[0]);

    }

}
