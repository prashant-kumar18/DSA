package Programs;
import java.util.Arrays;
import java.util.HashMap;

//brute Force o(n2)
// class countEqualPair18{
//     public static void main(String[] args) {
//         int a[]={1,7,5,1};
//         int k=6;
//         int count=0;
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i+1; j < a.length; j++) {
//                 if (a[i]+a[j]==k) {
//                     count+=1;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

//o(n)
class countEqualPair18 {
    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 4, 5, 7,1, 8, 9};//1,1,2,4,5,7,8,9
        int k = 6;
        HashMap<Integer, Integer> nums = new HashMap<>();

        int ans = 0;

        for (int i = 0; i < a.length; i++) {
            if (nums.containsKey(k - a[i])) {
                ans += nums.get(k - a[i]);
            }

            if (nums.containsKey(a[i]))
                nums.put(a[i], nums.get(a[i]) + 1);

            else
                nums.put(a[i], 1);
        }
        
       
   
        System.out.println(ans);
    }
}