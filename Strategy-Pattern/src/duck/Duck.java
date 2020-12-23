package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;

public abstract class Duck {

  protected FlyBehavior flyBehavior;

  protected QuackBehavior quackBehavior;

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void fly() {
    flyBehavior.fly();
  }

  public void quack() {
    quackBehavior.quack();
  }

  public abstract void display();

}
