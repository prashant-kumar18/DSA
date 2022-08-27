public class StairPath3 {
    public static void main(String[] args) {
        stair(3, 3, "");
    }

    static void stair(int i,int maxJumps,String str){
        if(i==0){
            System.out.println(str);
            str="";
        }
        if(i<0){
            return;
        }
        for (int j = 1; j <= maxJumps; j++) {
            stair(i-j,maxJumps,str+(j));
        }
       
    }
}
