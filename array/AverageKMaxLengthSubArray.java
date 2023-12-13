package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AverageKMaxLengthSubArray {
    public static void main(String[] args) {
        int ans = -1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        //user prefix sum 
        Map<Long, Integer> map = new HashMap<>();
        long s = 0;
        map.put(s, 0);
        for(int i=1; i<=n; i++) {
          s += in.nextInt()-k;
          if(!map.containsKey(s)) {
            map.put(s, i);  
          }
          else {
             ans = Math.max(ans, i-map.get(s));
          }
        }
        System.out.println(ans);
      }
}
