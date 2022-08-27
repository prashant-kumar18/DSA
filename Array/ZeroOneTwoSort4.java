public class ZeroOneTwoSort4 {
    public static void main(String[] args) {
        int a[]={1,1,0,0,2};
        int b[]=new int[a.length];
        //initilizing array with default value 1
        for (int i = 0; i < b.length; i++) {
            b[i]=1;
        }
        
        int start=0,end=a.length-1;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){b[start++]=0;}
            if(a[i]==2){b[end--]=2;}
            
        }
  

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
