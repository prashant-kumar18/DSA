
class AllIndicisReursion12{
    public static void main(String[] args) {
        int a[]={1,2,3,4,3,6,1,3,3};
      for (int i : indices(a, 0, 3, 0)) {
          System.out.println(i);
      }  
    }

   static int[] indices(int a[],int i,int x,int size){
        if(i==a.length)return new int[size];;
        if(a[i]==x){
            size++;

        }   int ind[]= indices(a, i + 1, x, size);

        if(a[i]==x){
            ind[size-1]=i;
        }

        return ind;
        
    }
}