package decorator;

import beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

  @Override
  public abstract String getDescription();
}
