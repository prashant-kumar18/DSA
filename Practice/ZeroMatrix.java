public class ZeroMatrix {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 1, 1 },
                { 1, 0, 0 },
                { 1, 1, 0 } };
        zero(a);

    }

    static void zero(int a[][]) {
        boolean v[][] = new boolean[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 0 && v[i][j] == false) {
                    int k = 0;
                    while (k < a.length) {
                        if (a[i][k] != 0) {
                            a[i][k] = 0;
                            v[i][k] = true;
                        }
                        k++;
                    }
                    k = 0;
                    while (k < a.length) {
                        if (a[k][j] != 0) {
                            a[k][j] = 0;
                            v[k][j] = true;

                        }
                        k++;
                    }

                }
            }
        }

        for (int[] bs : a) {
            for (int bs2 : bs) {
                System.out.print(bs2);
            }
            System.out.println();
        }
    }
}
