public class LargestConSubArray8 {
   public static void main(String[] args) {
       int a[]={-2,-3,4,-1-2,1,5,-3};
       int sum=Integer.MIN_VALUE;
       for (int i = 0; i < a.length; i++) {
           int tempSum=a[i];
           for (int j = i+1; j < a.length; j++) {
               tempSum = tempSum+a[j];
               if (tempSum >= sum)
                   sum = tempSum;
           }
        //    System.out.println(tempSum);
          
       }
       System.out.println(sum);
   } 
}
