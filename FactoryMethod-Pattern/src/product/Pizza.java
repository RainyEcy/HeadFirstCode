package product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

  String name = "unKnown Pizza";

  String dough = "unKnown Dough";

  String sauce = "unKnown sauce";

  List toppings = new ArrayList();

  public void prepare() {
    System.out.println(name);
    System.out.println(dough);
    System.out.println(sauce);
  }

  public abstract void bake();

  public abstract void cut();

  public abstract void box();

  public String getName() {
    return name;
  }

}
