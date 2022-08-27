package Programs;
public class BuyAndSell17 {
    public static void main(String[] args) {
        int a[]={6,4,2,3,9,1};
       
        int buyAt=0;
        int sellAt=0;
        int sum=0;
       for (int i = 0; i < a.length; i++) {
                      
           for (int j = i; j < a.length; j++) {
               if(a[j]-a[i]>sum ){
                   sum=a[j]-a[i];
                   buyAt=i;
                   sellAt=j;
             
               }
           }
       }

   System.out.println("buyAt= "+buyAt+" sellAt="+sellAt);
    }
}
