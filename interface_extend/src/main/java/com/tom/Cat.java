package com.tom;

/**
 * Cat
 */

// Cat类继承了Animal类的接口，需要实现eat()和move()方法
public class Cat implements Pet {
  @Override
  public void play() {
    System.out.println("Cat: I can play.");
  }

  // @Override
  // public void move() {
  // System.out.println("Cat: I can move.");
  // }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.play();
  }
}
