package creator;

import product.Cheese;
import product.Dough;
import product.MozzarellaCheese;
import product.ThinCrustDough;

public class NYPizzaIngreaientFactory implements PizzaIngredientFactory {

  private volatile static PizzaIngredientFactory pizzaIngredientFactory;

  private NYPizzaIngreaientFactory() {
  }

  public static PizzaIngredientFactory getInstance() {
    if (null == pizzaIngredientFactory) {
      synchronized (NYPizzaIngreaientFactory.class) {
        if (null == pizzaIngredientFactory) {
          pizzaIngredientFactory = new NYPizzaIngreaientFactory();
        }
      }
    }
    return pizzaIngredientFactory;
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }
}
