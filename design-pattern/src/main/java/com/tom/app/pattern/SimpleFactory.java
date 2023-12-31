package com.tom.app.pattern;

public class SimpleFactory {
  public static Coffee createInstance(String type) {
    if ("americano".equals(type)) {
      return new Americano();
    } else if ("cappuccino".equals(type)) {
      return new Cappuccino();
    } else if ("latte".equals(type)) {
      return new Latte();
    } else {
      throw new RuntimeException("type" + type + "can't find type");
    }
  }

  public static void main(String[] args) {
    Coffee latte = SimpleFactory.createInstance("latte");
    System.out.println("coffee" + latte.getName());
  }
}
