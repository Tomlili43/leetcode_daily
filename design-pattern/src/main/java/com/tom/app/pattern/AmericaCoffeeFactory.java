package com.tom.app.pattern;

public class AmericaCoffeeFactory extends CoffeeFactory {

  @Override
  public Coffee[] createCoffee() {
    // TODO Auto-generated method stub
    return new Coffee[] { new Americano(), new Latte() };
  }

}
