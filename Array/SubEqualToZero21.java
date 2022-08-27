package Programs;

import java.util.HashSet;
//o(n2)
// public class SubEqualToZero21 {
//     public static void main(String[] args) {
//         int a[]={4 ,2 ,3, -1, -2};
//         int sum=0;
//         for (int i = 0; i < a.length; i++) {
//             sum=a[i];
//             for (int j = i+1; j < a.length; j++) {
//                 sum+=a[j];
//                 if(sum==0){

//                     System.out.println("yes");
//                     break;
//                 }
//             }
//         }
//     }
// }
//o(n)+ space- o(n)

public class SubEqualToZero21 {
    public static void main(String[] args) {
        int a[] = { 4, 2, -2, 1, 2 };

        int sum = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {

            sum += a[i];

            if (set.contains(sum)) {
                System.out.println("true");
                break;
            }else{
                set.add(sum);
            }
         
        }

    }
}
