package product;

public class NYStyleCheesePizza extends Pizza {

  public NYStyleCheesePizza() {
    name = "NYStyleCheesePizza name";
    dough = "NYStyleCheesePizza dough";
    sauce = "NYStyleCheesePizza sauce";
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
