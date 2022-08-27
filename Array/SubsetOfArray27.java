import java.util.HashSet;
import java.util.Set;

class SubsetOfArray27{

    public static void main(String[] args) {
       int a[] = {10, 5, 2, 3, 19},
        b[] = {10, 5, 3};

System.out.println(subsetOrNot(a, b));

    }

  static  boolean subsetOrNot(int a[],int b[]){
        Set<Integer> set=new HashSet<>();
        
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            if(!set.contains(b[i]))return false;
        }
return true;
    }
}