import java.util.HashMap;

public class CountSubArray {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int a[] = { 6, 9, -3, 3, 3, -3, 6 };
        int target = 6;
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (map.containsKey(sum - target)) {

                count += map.get(sum - target);

            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        System.out.println(count);

    }

}
