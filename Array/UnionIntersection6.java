import java.util.HashSet;
import java.util.Set;

public class UnionIntersection6 {
   
public static void main(String[] args) {
    int a[] = {1,2,3 ,4};
    int b[] = { 4,5,6,};
   
   intersection(a, b);
}

  static void union(int a[],int b[]){

      Set<Integer> set = new HashSet<Integer>();

      for (int i = 0; i < a.length; i++) {

          set.add(a[i]);
      }
      for (int i = 0; i < b.length; i++) {

          set.add(b[i]);
      }
      Integer c[] = new Integer[set.size()];
      set.toArray(c);
      for (Integer integer : c) {
          System.out.println(integer);
      }

  }      
  static void intersection(int a[],int b[]){

      Set<Integer> set = new HashSet<Integer>();
      Integer c[] = new Integer[set.size()];
      for (int i = 0; i < a.length; i++) {

          set.add(a[i]);
      }
      for (int i = 0; i < b.length; i++) {
        if(set.contains(b[i])){
           
            System.out.println(b[i]);
        }
          
      }
     
     

  }      
    
}
