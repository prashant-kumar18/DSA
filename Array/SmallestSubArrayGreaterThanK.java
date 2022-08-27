package Programs;
//o(n2)
// public class SmallestSubArrayGreaterThanK {
//     public static void main(String[] args) {
//         int a[]={1, 4, 45, 6, 0, 19};
//         int k=51;
//         int min=a.length;
//         int sum=0;
//         for (int i = 0; i < a.length; i++) {
//             sum=a[i];
         
//             for (int j = i+1; j < a.length; j++) {
//                 sum+=a[i];
//                 if(sum>k){
                   
//                     if(j-i<min){
                      
//                         min=j-i;}
//                 }
                
//             }
//         }
//         System.out.println(min);
//     }
// }
//o(n)
public class SmallestSubArrayGreaterThanK {
    public static void main(String[] args) {
        int a[] = { 1, 4, 61, 6, 0, 19 };
        int k = 51;
        int min = a.length;
        int i=0,j=0;
        int sum = 0;
        while (i<=j &j<a.length) {
            while (sum<=k&&j<a.length) {
                sum+=a[j];
                j++;
            }
            while (sum>k &&i<j) {
              
                min=Math.min(min, j-i);
              
                sum-=a[i];
                i++;
               
            }
        }
        System.out.println(min);
    }
}
