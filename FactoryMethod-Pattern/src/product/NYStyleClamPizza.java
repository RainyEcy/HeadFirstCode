package product;

public class NYStyleClamPizza implements Pizza {

  @Override
  public void prepare() {
    System.out.println(this.getClass().getSimpleName() + Thread.currentThread().getStackTrace()[1]
        .getMethodName());
  }

  @Override
  public void bake() {
    System.out.println(this.getClass().getSimpleName() + Thread.currentThread().getStackTrace()[1]
        .getMethodName());
  }

  @Override
  public void cut() {
    System.out.println(this.getClass().getSimpleName() + Thread.currentThread().getStackTrace()[1]
        .getMethodName());
  }

  @Override
  public void box() {
    System.out.println(this.getClass().getSimpleName() + Thread.currentThread().getStackTrace()[1]
        .getMethodName());
  }

}
