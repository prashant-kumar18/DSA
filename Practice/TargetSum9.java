public class TargetSum9 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};

target(a, 0, 0,"", 4);
    }
    static void target(int[] a,int i,int sum,String asf, int k){
        if(sum==k){
            System.out.println(asf);
            return;
        }
        if(i>a.length-1)return;

        target(a, i+1,sum+a[i],asf+a[i], k);
        target(a, i+1,sum,asf, k);
    }
}
