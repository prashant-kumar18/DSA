package Programs;

// public class MaxProductSub23 {
   

//     public static void main(String[] args) {
//         int a[] ={6, -3, -10, 0, 2};

//         int p = 1;
//         if (a.length == 0)
//             System.out.println(-1);
//         if (a.length == 1)
//             System.out.println(a[0]);
//         int maxProduct = Integer.MIN_VALUE;
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] == 0)
//                 continue;
//             p = a[i];
//             if (p > maxProduct) {
//                 maxProduct = p;
//             }
//             for (int j = i + 1; j < a.length; j++) {

//                 p *= a[j];

//                 if (p > maxProduct) {
//                     maxProduct = p;
//                 }
//             }
//         }

//     }
// }

public class MaxProductSub23 {

    public static void main(String[] args) {
       int a[] = { 6, -3, -10, 0, 2 };          //-18 , 180, 0 ,2
        int maxPro = a[0];
        int curPro=a[0];
        for(int i = 1;i<a.length;i++)
        { 
            
            
            curPro = curPro * a[i];
            System.out.println(curPro);
            if (curPro > maxPro) {

                maxPro = curPro;

            }
            if (curPro == 0)
            curPro = 1;
          
        }
        System.out.println(maxPro);
        }

    }

