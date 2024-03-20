package com.example.hj;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class  MMRandom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    TreeSet set = new TreeSet();

    for(int i = 0; i < num; i++) {
      set.add(sc.nextInt());
    }

    Iterator it = set.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }

  }
}
