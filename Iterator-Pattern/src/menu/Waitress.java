package menu;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuMenuIterator = pancakeHouseMenu.getMenuIterator();
        Iterator dinerMenuMenuIterator = dinerMenu.getMenuIterator();
        Iterator cafeMenuMenuIterator = cafeMenu.getMenuIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseMenuMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuMenuIterator);
        System.out.println("\nDINNER");
        printMenu(cafeMenuMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem next = (MenuItem) iterator.next();
            System.out.println(next);
        }
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n---------------");
        printVegetarianMenu(pancakeHouseMenu.getMenuIterator());
        printVegetarianMenu(dinerMenu.getMenuIterator());
        printVegetarianMenu(cafeMenu.getMenuIterator());
    }

    public boolean isItemVegetarian(String name) {
        Iterator pancakeIterator = pancakeHouseMenu.getMenuIterator();
        if (isVegetarian(name, pancakeIterator)) {
            return true;
        }
        Iterator dinerIterator = dinerMenu.getMenuIterator();
        if (isVegetarian(name, dinerIterator)) {
            return true;
        }
        Iterator cafeIterator = cafeMenu.getMenuIterator();
        if (isVegetarian(name, cafeIterator)) {
            return true;
        }
        return false;
    }


    private void printVegetarianMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem next = (MenuItem) iterator.next();
            if (next.isVegetarian()) {
                System.out.println(next);
            }
        }
    }

    private boolean isVegetarian(String name, Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem next = (MenuItem) iterator.next();
            if (next.getName().equalsIgnoreCase(name)) {
                return next.isVegetarian();
            }
        }

        return false;
    }
}
