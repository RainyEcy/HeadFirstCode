package product;

public abstract class Pizza {

  private String name;

  private Cheese cheese;

  private Dough dough;

  public abstract void prepare();

  public void bake() {
    System.out.println(" Bake for 25 Minutes at 350 ");
  }

  public void cut() {
    System.out.println(" Cutting the pizza into diagonal alices ");
  }

  public void box() {
    System.out.println(" Place pizz in official PizzaStore Bok");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cheese getCheese() {
    return cheese;
  }

  public void setCheese(Cheese cheese) {
    this.cheese = cheese;
  }

  public Dough getDough() {
    return dough;
  }

  public void setDough(Dough dough) {
    this.dough = dough;
  }

  @Override
  public String toString() {
    return "Pizza{" +
        "name='" + name + '\'' +
        ", cheese=" + cheese +
        ", dough=" + dough +
        '}';
  }
}
