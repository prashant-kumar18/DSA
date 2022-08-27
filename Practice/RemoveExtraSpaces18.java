public class RemoveExtraSpaces18 {
    public static void main(String[] args) {
       String str = "   Hello Geeks . Welcome   to  GeeksforGeeks            poyyu         .    ";


       str.trim();
       StringBuffer str2=new StringBuffer(str);
        int count=0;
        int i=0;
        while (i<str2.length()) {
            if(str2.charAt(i)==' '){
                count++;
            }else{
                count=0;
            }
            if(str2.charAt(i) == '.'){
             str2= remove(str2, i);
            }
           if(str2.charAt(i)==' '&&count>1){
               str2.deleteCharAt(i);
           }else{
               i++;
           }
       
        }
        System.out.println(str2);
    }

  static  StringBuffer remove(StringBuffer str2,int i){
        int k=i-1;
        while(k<str2.length()&&str2.charAt(k)==' '){
           
            str2.deleteCharAt(k--);
        }
        k=k+2;
          while(k<str2.length()&&str2.charAt(i)==' '){
            str2.deleteCharAt(k++);
        }

        return str2;
    }
}
