import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AddToMulti {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // 注意 hasNext 和 hasNextLine 的区别
    ArrayList<Integer> arr = new ArrayList<Integer>();
    while (in.hasNextInt()) { // 注意 while 处理多个 case
      int a = in.nextInt();
      // add elements to array
      int sum = 0;
      for (int i = 0; i < a; i++) {
        arr.add(in.nextInt());
        sum += arr.get(i);
      }
      for (int i =0;i<a-1;i++){
        sum = Math.max(sum,sum-arr.get(i)-arr.get(i+1)+arr.get(i)*arr.get(i+1));
      }
      System.out.println(sum);
    }
  }
  
}
