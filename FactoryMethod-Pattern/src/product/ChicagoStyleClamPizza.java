package product;

public class ChicagoStyleClamPizza extends Pizza {

  public ChicagoStyleClamPizza() {
    name = "ChicagoStyleClamPizza name";
    dough = "ChicagoStyleClamPizza dough";
    sauce = "ChicagoStyleClamPizza sauce";
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
