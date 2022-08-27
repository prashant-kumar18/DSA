public class Module {

    public static void main(String[] args) {
        int arr[] = { 1,2,3 };
        System.out.println(solution(3, 2, arr));
    }

    static int solution(int n, int m, int arr[]) {
        int mod = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum % m > mod) {
                    mod = sum % m;
                }
            }

        }
        return mod;
    }

}
