package Programs;
import java.util.LinkedList;

public class MergeIntervals14 {
    public static void main(String[] args) {
     int   a[][] = {{1,2},{3,5},{4,9},{8,10},{11,13},{15,18}};
    LinkedList<int[]> list=new LinkedList<>();
    list.add(a[0]);
     for (int i = 1; i < a.length; i++) {
         int temp[] = list.removeLast();
        if(temp[1]>a[i][0]){
            temp[0]=Integer.min(temp[0], a[i][0]);
            temp[1]=Integer.max(temp[1], a[i][1]);
          
            list.add( temp);
            
        }else{
            list.add(temp);
            list.add(a[i]);
        }

     }
System.out.println(list.size());
     for (int i[] : list) {
         System.out.println(i[0]+" "+i[1]);
     }
}

}
