package decorator;

import beverage.Beverage;

public class Milk extends CondimentDecorator {

  private Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " add Milk";
  }

  @Override
  public double cost() {
    return 0.5 + beverage.cost();
  }
}
