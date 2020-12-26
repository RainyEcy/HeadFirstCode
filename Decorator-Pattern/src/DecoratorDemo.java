import beverage.Beverage;
import beverage.DarkRoast;
import decorator.Milk;
import decorator.Mocha;

public class DecoratorDemo {

  public static void main(String[] args) {
    Beverage beverage = new DarkRoast();
    beverage = new Milk(beverage);
    beverage = new Mocha(beverage);
    System.out.println(beverage.getDescription());
    System.out.println(beverage.cost());
  }

}
