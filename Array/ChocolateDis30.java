package Programs;
import java.util.ArrayList;
import java.util.Collections;

class ChocolateDis30{

    public static void main(String[] args) {
      ArrayList<Long> a=  new ArrayList<>();
      Collections.sort(a);
     

int m=5;
Collections.sort(a);

long ans = Long.MAX_VALUE;

for (int i = 0; i < a.size() - m; i++) {
    if ((a.get(i + m - 1) - a.get(i)) < ans)
        ans = a.get(i + m - 1) - a.get(i);
}
      System.out.println(ans);
    }
}