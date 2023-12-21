package array;

import java.util.LinkedList;

public class JosephusProblem {
    public int iceBreakingGame(int num, int target) {
        LinkedList<Integer> sur= new LinkedList();
        for(int i = 1;i<=num;i++){
            sur.add(i);
        }
        int index =0;
        while(sur.size()>1){
            index = (index + target-1)%sur.size();
            sur.remove(index);
        }
        return sur.get(0);
  }
  public static void main(String[] args) {
    JosephusProblem jp = new JosephusProblem();
    System.out.println(jp.iceBreakingGame(7, 4));

  }
}
