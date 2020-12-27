package product;

import creator.PizzaIngredientFactory;

public class ChessPizza extends Pizza {

  private PizzaIngredientFactory pizzaIngredientFactory;

  public ChessPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + getName());
    Cheese cheese = pizzaIngredientFactory.createCheese();
    System.out.println("Cheese " + cheese.toString());
    super.setCheese(cheese);
    Dough dough = pizzaIngredientFactory.createDough();
    System.out.println(dough.toString());
    super.setDough(dough);
  }
}
