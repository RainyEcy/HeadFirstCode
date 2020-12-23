package duck;

import fly.FlyWithWings;
import quack.Quack;

public class BlueDuck extends Duck {

  public BlueDuck() {
    super.flyBehavior = new FlyWithWings();
    super.quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("我是蓝头鸭子！");
  }

}
