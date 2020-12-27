import creator.PizzaStore;
import creator.SimplePizzaFactory;

public class PizzaDemo {

  public static void main(String[] args) {
    PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
    pizzaStore.orderPizza("veggie");
  }

}
