package com.tom.app.pattern;

public class ChinaCoffeeFactory extends CoffeeFactory {

  @Override
  public Coffee[] createCoffee() {
    // TODO Auto-generated method stub
    return new Coffee[] { new Cappuccino(), new Latte() };
  }

}
