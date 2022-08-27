public class Permutation7 {
    public static void main(String[] args) {
        String str="abc";
        per(str, "");
    }
    static void per(String str,String permString){
        if(str.length()<=0){
            System.out.println(permString);
        }

        for (int i = 0; i < str.length(); i++) {
             String first=str.charAt(i)+"";
        String other=str.substring(0, i)+str.substring(i+1);
        per(other,permString+first);
     
        }
       
        
    }
}
