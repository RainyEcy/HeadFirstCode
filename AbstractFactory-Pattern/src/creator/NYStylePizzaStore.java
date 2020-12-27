package creator;

import product.ChessPizza;
import product.Pizza;

public class NYStylePizzaStore extends PizzaStore {

  private PizzaIngredientFactory pizzaIngredientFactory = NYPizzaIngreaientFactory.getInstance();

  @Override
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    switch (type) {
      case "cheese":
        pizza = new ChessPizza(pizzaIngredientFactory);
        pizza.setName("New York Style Cheese Pizza");
        break;
      default:
        break;
    }
    return pizza;
  }
}
