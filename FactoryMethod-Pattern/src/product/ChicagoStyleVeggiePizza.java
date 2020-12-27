package product;

public class ChicagoStyleVeggiePizza extends Pizza {

  public ChicagoStyleVeggiePizza() {
    name = "ChicagoStyleVeggiePizza name";
    dough = "ChicagoStyleVeggiePizza dough";
    sauce = "ChicagoStyleVeggiePizza sauce";
    toppings.add("Veggie");
  }
  
  @Override
  public void bake() {
    System.out.println(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1]
        .getMethodName());
  }

  @Override
  public void cut() {
    System.out.println(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1]
        .getMethodName());
  }

  @Override
  public void box() {
    System.out.println(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1]
        .getMethodName());
  }

}
