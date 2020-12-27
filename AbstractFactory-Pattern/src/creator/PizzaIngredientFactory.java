package creator;

import product.Cheese;
import product.Dough;

public interface PizzaIngredientFactory {

  Cheese createCheese();

  Dough createDough();

}
