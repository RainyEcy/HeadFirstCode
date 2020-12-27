package product;

public class ChicagoStyleCheesePizza extends Pizza {

  public ChicagoStyleCheesePizza() {
    name = "ChicagoStyleCheesePizza name";
    dough = "ChicagoStyleCheesePizza dough";
    sauce = "ChicagoStyleCheesePizza sauce";
    toppings.add("Cheese");
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
