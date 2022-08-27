import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Company com = new Company();
        Producer p = new Producer(com);
        Consumer c = new Consumer(com);
        p.start();
        c.start();

    }

}

    public static void main(String[] args) {
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }

    }

    void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public class Producer extends Thread {

        Company c;

        Producer(Company c) {
            this.c = c;

        }

        @Override
        public void run() {

            while (true) {
                this.c.produce();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }

            }

        }

    }

    public class Consumer extends Thread {

        Company c;

        Consumer(Company c) {
            this.c = c;

        }

        @Override
        public void run() {

            while (true) {
                this.c.consume();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }

            }

        }

    }

class Company {
    boolean isProducing = true;

    synchronized public void consume() throws Exception {
        if (isProducing == true) {
            wait();

        }
        System.out.println("consuming...consumed");
        isProducing = true;
        notify();

    }

    synchronized public void produce() throws Exception {
        if (isProducing == false) {
            wait();
        }
        System.out.println("producing...produced");
        isProducing = false;
        notify();

    }
}
