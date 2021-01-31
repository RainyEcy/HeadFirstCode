package menu;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position <= menuItems.length - 1 && null != menuItems[position];
    }

    @Override
    public Object next() {
        return menuItems[position++];
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException(("You can't remove an item until you've done at least one next()"));
        }
        if (menuItems.length - 1 - (position - 1) >= 0) {
            System.arraycopy(menuItems, position - 1 + 1, menuItems, position - 1, menuItems.length - 1 - (position - 1));
        }
        menuItems[menuItems.length - 1] = null;
    }

}
