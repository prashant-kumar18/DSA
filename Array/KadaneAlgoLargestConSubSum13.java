package Programs;
public class KadaneAlgoLargestConSubSum13 {
    public static void main(String[] args) {
          int a[]={-5,2,-3,};
          int maxSum=a[0];
          int curSum=0;
          for (int i = 1; i < a.length; i++) {
              curSum =curSum+ a[i];
              if(curSum>maxSum){
               
                maxSum= curSum;
                
            }
             if(curSum<0)  curSum=0;
          }
          System.out.println(maxSum);
    }
}
