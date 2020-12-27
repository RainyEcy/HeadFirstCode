package creator;

import product.NYStyleCheesePizza;
import product.NYStyleClamPizza;
import product.NYStyleVeggiePizza;
import product.Pizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;
    switch (type) {
      case "cheese":
        pizza = new NYStyleCheesePizza();
        break;
      case "clam":
        pizza = new NYStyleClamPizza();
        break;
      case "veggie":
        pizza = new NYStyleVeggiePizza();
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + type);
    }
    return pizza;
  }

}
