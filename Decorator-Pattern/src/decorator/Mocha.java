package decorator;

import beverage.Beverage;

public class Mocha extends CondimentDecorator {

  private Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " add Mocha";
  }

  @Override
  public double cost() {
    return 0.87 + beverage.cost();
  }
}
