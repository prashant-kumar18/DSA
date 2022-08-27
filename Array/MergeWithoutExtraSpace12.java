package Programs;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeWithoutExtraSpace12 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4,7 };
        int b[] = {   3,5 ,8};
        int i=0,j=0;
        while(i<a.length && j<a.length){

            if(a[i]<b[j]){
                i++;
            }else{
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                Arrays.sort(b);
            }

        }
        for (int j2 = 0; j2 < a.length; j2++) {
            System.out.println(a[j2]);
        }
     
    }
}
