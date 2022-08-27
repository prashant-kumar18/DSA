public class RemoveAdjDuplicate38 {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(remove(s));
    }

   static String remove(String s){
String st="";

    for (int i = 0; i < s.length(); i++) {

            if(i+1==s.length()){
                st += s.charAt(i);
            }else if
            (s.charAt(i)!=s.charAt(i+1)){
                st+=s.charAt(i);
            }
            
    }


       return st;
   }
}
