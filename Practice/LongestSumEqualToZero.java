import java.util.HashMap;

public class LongestSumEqualToZero {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int a[] = { 0,-3,3 };
        map.put(0, -1);
        int sum = 0;
        int longest = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (map.containsKey(sum)) {
                int temp = i - map.get(sum);
                if (temp > longest) {
                    longest = temp;
                }

            } 
                map.put(sum, i);

        

        }

        System.out.println(longest);

    }

}
