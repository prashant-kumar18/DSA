import java.util.Arrays;

public class KthMaxAndMin3 {
    public static void main(String[] args) {
        int a[]={100,2,3,4,5,6};
        for (int i = 0; i < a.length; i++) {
            int min=i;
            for (int j = i; j < a.length; j++) {
                if(a[j]<a[min])min=j;
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
for (int i = 0; i < a.length; i++) {
    System.out.println(a[i]);
}

    }
}
