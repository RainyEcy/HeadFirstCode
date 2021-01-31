package menuiterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    String name;
    String description;
    double price;
    boolean vegetraian;

    public MenuItem(String name, String description,
                    boolean vegetraian,
                    double price
    ) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetraian = vegetraian;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vegetraian=" + vegetraian +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetraian;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
