//its not stack problem but a good question 

public class TrapRainWater29 {// https://youtu.be/UZG3-vZlFM4
    public static void main(String[] args) {
        int a[] = { 2, 1, 3, 0, 2 };
        int leftmax[] = new int[a.length];
        int rightmax[] = new int[a.length];
        leftmax[0] = a[0];
        rightmax[a.length - 1] = a[a.length - 1];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > leftmax[i - 1]) {
                leftmax[i] = a[i];
            } else {
                leftmax[i] = leftmax[i - 1];
            }

        }

        for (int i = a.length - 2; i >= 0; i--) {

            if (a[i] > rightmax[i + 1]) {
                rightmax[i] = a[i];
            } else {
                rightmax[i] = rightmax[i + 1];
            }

        }
        int sum = 0;
        for (int i = 0; i < rightmax.length; i++) {
            sum = sum + (Math.min(leftmax[i], rightmax[i]) - a[i]);
        }

        for (int i = 0; i < rightmax.length; i++) {
            System.out.print(leftmax[i]);
        }
        System.out.println();
        for (int i = 0; i < rightmax.length; i++) {
            System.out.print(rightmax[i]);
        }

        System.out.println("sum=" + sum);
    }
}
