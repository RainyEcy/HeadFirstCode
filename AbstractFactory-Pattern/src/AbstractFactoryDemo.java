import creator.NYStylePizzaStore;
import creator.PizzaStore;
import product.Pizza;

public class AbstractFactoryDemo {

  public static void main(String[] args) {
    PizzaStore pizzaStore = new NYStylePizzaStore();
    Pizza pizza = pizzaStore.orderPizza("cheese");
    System.out.println(pizza);
  }

}
