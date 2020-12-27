package product;

public class NYStyleVeggiePizza extends Pizza {

  public NYStyleVeggiePizza() {
    name = "NYStyleVeggiePizza name";
    dough = "NYStyleVeggiePizza dough";
    sauce = "NYStyleVeggiePizza sauce";
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
