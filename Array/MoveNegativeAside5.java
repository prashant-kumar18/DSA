public class MoveNegativeAside5 {
    public static void main(String[] args) {
        int a[] = {-2,1,1,-1, 1,-2, -3,};
        int k=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<0){
                int temp=a[i];
                a[i]=a[k];
                a[k]=temp;
                
               
                k++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
