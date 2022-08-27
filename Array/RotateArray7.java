public class RotateArray7 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,};
            //2,3,4,5,1
            //3,4,5,1,2
            //4,5,1,2,3
        int k=3;
        int i=0;
        while (i!=k) {
            int temp=a[0];
            int j=0;
            for (j = 0; j < a.length-1; j++) {
                a[j]=a[j+1];
            }
            a[a.length-1]=temp;
            i++;
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }
}
