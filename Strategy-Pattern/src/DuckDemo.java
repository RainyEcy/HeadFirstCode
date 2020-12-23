import duck.BlueDuck;
import duck.Duck;
import fly.FlyNoWay;

public class DuckDemo {

  public static void main(String[] args) {
    Duck duck = new BlueDuck();
    duck.display();
    duck.fly();
    duck.quack();
    duck.setFlyBehavior(new FlyNoWay());
    duck.fly();
  }

}
