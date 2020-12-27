package creator;

import product.ChicagoStyleCheesePizza;
import product.ChicagoStyleClamPizza;
import product.ChicagoStyleVeggiePizza;
import product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;
    switch (type) {
      case "cheese":
        pizza = new ChicagoStyleCheesePizza();
        break;
      case "clam":
        pizza = new ChicagoStyleClamPizza();
        break;
      case "veggie":
        pizza = new ChicagoStyleVeggiePizza();
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + type);
    }
    return pizza;
  }

}
