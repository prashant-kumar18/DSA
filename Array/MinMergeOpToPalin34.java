package Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MinMergeOpToPalin34 {
    public static void main(String[] args) {
        Integer a[]={1,9,5,4,4,1};
        ArrayList<Integer> list=new ArrayList<>();
   Collections.addAll(list, a);
        int i=0,j=a.length-1;

        while (i<list.size()&&j>0 &&i<j) {
            if(list.get(i)==list.get(j)){
                i++;
                j--;
            }else if(list.get(i) < list.get(j)){
                list.add(i, list.remove(i)+list.remove(i));
               
                j--;

            }else{
                list.add(j, list.remove(j) + list.remove(j - 2));
                j--;
            }
        }

        for (Integer e : list) {
            System.out.println(e);
        }
    }
}
