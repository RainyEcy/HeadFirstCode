package product;

public class NYStyleClamPizza extends Pizza {

  public NYStyleClamPizza() {
    name = "NYStyleClamPizza name";
    dough = "NYStyleClamPizza dough";
    sauce = "NYStyleClamPizza sauce";
    toppings.add("Clam");
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
