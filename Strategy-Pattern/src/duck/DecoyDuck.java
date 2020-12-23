package duck;

import fly.FlyNoWay;
import quack.MuteQuack;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    super.flyBehavior = new FlyNoWay();
    super.quackBehavior = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("我是诱饵鸭子！");
  }

}
