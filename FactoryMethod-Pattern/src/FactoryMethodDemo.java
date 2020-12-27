import creator.NYPizzaStore;
import creator.PizzaStore;
import product.Pizza;

public class FactoryMethodDemo {

  public static void main(String[] args) {
    PizzaStore pizzaStore = new NYPizzaStore();
    Pizza pizza = pizzaStore.orderPizza("cheese");
    System.out.println(pizza.getName());
  }

}
