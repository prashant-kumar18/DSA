package Programs;
import java.util.HashSet;
import java.util.Set;

public class Duplicate11 {
    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1 - 2, 1, 5, -3 };
           Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                System.out.println(nums[i]);
                break ;
            }else
                set.add(nums[i]);
        }
    }
}
