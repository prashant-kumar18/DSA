public class MinAndMax2 {
    public static void main(String[] args) {
        int a[]={10,-2,3,4,5000};
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min)
            min=a[i];
            if(a[i]>max)
            max=a[i];
        }
        System.out.println("Max="+max+" Min="+min);
    }
}
