// package Programs;

// import java.util.HashSet;
// import java.util.Set;
//O(n2)+O(n)
// public class TripletSum28 {
//     public static void main(String[] args) {
//         int a[]={1 ,4 ,45 ,6 ,10 ,8};
// int k=13;
//         Set<Integer> set=new HashSet<>();
//         for (int i = 0; i < a.length; i++) {
//          set.add(a[i]);   
//         }

//         for (int i = 0; i < a.length; i++) {
            
//             for (int j = 0; j < a.length; j++) {
//                 if(set.contains(k-(a[i]+a[j])) ){
                  
//                     System.out.println(true);
//                     break;
//                 }
//             }
//         }
//     }
// }
//O(n2)+O(1)
package Programs;
import java.util.Arrays;
public class TripletSum28 {
    public static void main(String[] args) {
        int a[] = { 10, 4, 45, 6, 10, 8 };
                //1,4,6,8,10,45
        int t = 13;
     Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            int j=i+1,k=a.length-1;
           while(j<k){
            if((a[i]+a[j]+a[k])==t){
                System.out.println("yes");
                break;
            }
            else if((a[i] + a[j] + a[k]) < t){
                j++;
            }
            else{
                k--;
            }
            
           }
               
            }
        }
    }

