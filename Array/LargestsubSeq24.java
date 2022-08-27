package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestsubSeq24 {
    public static void main(String[] args) {
        int a[]= { 2, 6, 1, 9, 4, 5, 3 };
                // 1, 2, 3, 4,7,8,9,

        Arrays.sort(a);

        int curCount=0;
        int maxCount=0;
        for (int i = 1; i < a.length; i++) {
            
            if(a[i]==a[i-1]+1){
                
            curCount++;
            }else
            curCount=0;

            if(curCount>maxCount)
            maxCount=curCount;
        }
        System.out.println(maxCount);
    }
}


