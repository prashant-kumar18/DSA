public class RepeatAndMissing {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 4 };
        int n = a.length;
        int s = n * (n + 1) / 2;
        int p = (n * (n + 1) * (2 * n + 1)) / 6;
        int s1 = 0;
        int p1 = 0;
        for (int i = 0; i < a.length; i++) {
            s1 = s1 + a[i];
            p1 = p1 + (a[i] * a[i]);
        }

        int sd = s - s1;
        int pd = p - p1;

        int missing = (sd + pd / sd) / 2;
        int repeat = (pd / sd - sd) / 2;
        System.out.println(missing);
        System.out.println(repeat);
    }
}
