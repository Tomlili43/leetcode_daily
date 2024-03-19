package com.example.hj;

import java.util.Scanner;

public class FromatConvert {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 注意 hasNext 和 hasNextLine 的区别
    while(sc.hasNextLine()){
        String s = sc.nextLine();
        System.out.println(Integer.parseInt(s.substring(2,s.length()),16));
        Integer.parseInt(s.substring(2,s.length()),16);
    }
}  
}
