package duck;

import fly.FlyNoWay;
import quack.Squack;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super.flyBehavior = new FlyNoWay();
    super.quackBehavior = new Squack();
  }

  @Override
  public void display() {
    System.out.println("我是橡皮鸭子！");
  }

}
