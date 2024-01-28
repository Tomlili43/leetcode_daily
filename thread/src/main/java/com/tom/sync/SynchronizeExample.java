package com.tom.sync;

public class SynchronizeExample {

  public static void main(String[] args) {
    ThreadDemo threadDemo = new ThreadDemo();
    threadDemo.start();
    ThreadDemo threadDemo2 = new ThreadDemo();
    threadDemo2.start();
  }

}

class ThreadDemo extends Thread {
  @Override
  public void run() {
    Printer printer = new Printer();
    printer.printing(5);
  }
}

class Printer {

  // public void printing(int count) {
  // synchronized (Printer.class) {
  // for (int i = count; i > 0; i--) {
  // System.out.println("Printing " + "Thread" + Thread.currentThread() + i);
  // }
  // }
  // }

  public void printing(int count) {
    for (int i = count; i > 0; i--) {
      System.out.println("Printing " + "Thread" + Thread.currentThread() + i);
    }
  }
}
