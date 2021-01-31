package menuiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    ArrayList menuComponentList = new ArrayList();
    String name;
    String descrption;

    public Menu(String name, String descrption) {
        this.name = name;
        this.descrption = descrption;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return descrption;
    }

    @Override
    boolean addMenuComponent(MenuComponent menuComponent) {
        return menuComponentList.add(menuComponent);
    }

    @Override
    boolean removeMenuComponent(MenuComponent menuComponent) {
        return menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponentList.get(i);
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        for (Object o : menuComponentList) {
            MenuComponent menuComponent = (MenuComponent) o;
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponentList.iterator());
    }
}
