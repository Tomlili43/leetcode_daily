package com.tom.app;

public class ThreadTest {
  
      public static void main(String[] args) {
          Thread t = new Thread(new Runnable() {
              public void run() {
                  System.out.println("Hello from new thread");
              }
          });
          t.start();
          System.out.println("Hello from main thread");   
      }
}
