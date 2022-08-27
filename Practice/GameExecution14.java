import java.util.LinkedList;

public class GameExecution14 {
    public static void main(String[] args) {
        int a[]={};
        LinkedList<Integer> list=new LinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
game(list, 0, 1, 3);
    }

 static void   game(LinkedList<Integer> list,int i,int counter,int k){
     if(list.size()==1){
         for (Integer integer : list) {
             System.out.print(integer);
         }
         return;
     }
     if(i>=list.size()){
         i=0;
     }
     if(counter==k){
         for (Integer integer : list) {
             System.out.print(integer);
         }
         System.out.println();
         list.remove(i);
         counter=1;
     }

    game(list, i+1, counter+1,k);

    }
}
