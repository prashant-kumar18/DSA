import java.util.Arrays;
import java.util.Stack;

public class Practice {

    public static void main(String[] args) {

        int a[] = {1 ,2 ,6, 3, 4};//1,2,2,5,6
        System.out.println(diff(a, 0));
    }

    public static boolean diff(int a[], int t) {

        Arrays.sort(a);
        int i = 0, j = 1;
        int current = 0;
        while (i <a.length&& j<a.length ) {
            current = a[j] - a[i];
            if (current == t) {
               return true;
            }
           else if (current < t)
                j++;
            else
            {
                i++;
            }


        }
        return false;

    }
}
