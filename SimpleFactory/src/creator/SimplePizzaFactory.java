package creator;

import product.CheesePizza;
import product.ClamPizza;
import product.Pizza;
import product.VeggiePizza;

public class SimplePizzaFactory {

  public Pizza createPizza(String type) {
    Pizza pizza = null;
    switch (type) {
      case "cheese":
        pizza = new CheesePizza();
        break;
      case "clarm":
        pizza = new ClamPizza();
        break;
      case "veggie":
        pizza = new VeggiePizza();
        break;
      default:
        break;
    }
    return pizza;
  }

}
