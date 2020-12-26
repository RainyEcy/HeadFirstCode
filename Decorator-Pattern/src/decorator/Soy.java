package decorator;

import beverage.Beverage;

public class Soy extends CondimentDecorator {

  private Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " add Soy";
  }

  @Override
  public double cost() {
    return 0.43 + beverage.cost();
  }

}
