package com.tom.app;

import java.util.ArrayList;
import java.util.*;

public class Futu2 {
  public int getTradeTime(String[][] com_opens) {
    int count = 0;
    // div company
    List<Interger> div = new ArrayList();
    div.add(0);
    for (int i = 0; i < com_opens.length; i++) {
      if (com_opens[i][0] != com_opens[i - 1][0])
        div.add(i);
    }
    for (int i = 0; i < div.length; i++) {
      List<String> stack = new LinkedList<>();
      for (int j = div[i]; j < div[i + 1]; j++) {
        if (com_opens[j][2] == "平") {
          stack.offer("开");
        } else if (com_opens[j][2] == "平" && !stack.isEmpty()) {
          stack.poll();
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    List<Integer> div = new ArrayList<>();
    div.add(1);
    div.get(0);
  }
}
