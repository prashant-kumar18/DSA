package Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MoreThanNByK25 {
    public static void main(String[] args) {
        int a[]={3, 1, 2, 2, 1, 2, 3, 3};
      Map<Integer,Integer> map=new HashMap<>();

       
        for (int i = 1; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0)+1);

        }

        for (int i : map.keySet()) {
            
            if(map.get(i)>a.length/4){
                System.out.println(i);
            }
        }
   
    }
}
