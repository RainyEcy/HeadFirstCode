package decorator;

import beverage.Beverage;

public class Whip extends CondimentDecorator {

  private Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " add Whip";
  }

  @Override
  public double cost() {
    return 0.12 + beverage.cost();
  }
}
