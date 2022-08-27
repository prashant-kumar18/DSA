package Programs;
public class CountInversion16 {
    public static void main(String[] args) {
        int a[]={2, 4, 1, 3, 5};
int inver=0;
        for (int i = 0; i < a.length; i++) {
            
            for (int j = i; j < a.length; j++) {
                if(a[i]>a[j]) inver++;
            }
        }
        System.out.println(inver);
    }
}
