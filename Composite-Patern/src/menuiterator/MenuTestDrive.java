package menuiterator;

public class MenuTestDrive {
	public static void main(String args[]) {

		MenuComponent pancakeHouseMenu = 
			new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = 
			new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = 
			new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = 
			new Menu("DESSERT MENU", "Dessert of course!");
  
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
  
		allMenus.addMenuComponent(pancakeHouseMenu);
		allMenus.addMenuComponent(dinerMenu);
		allMenus.addMenuComponent(cafeMenu);
  
		pancakeHouseMenu.addMenuComponent(new MenuItem(
			"K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs, and toast", 
			true,
			2.99));
		pancakeHouseMenu.addMenuComponent(new MenuItem(
			"Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99));
		pancakeHouseMenu.addMenuComponent(new MenuItem(
			"Blueberry Pancakes",
			"Pancakes made with fresh blueberries, and blueberry syrup",
			true,
			3.49));
		pancakeHouseMenu.addMenuComponent(new MenuItem(
			"Waffles",
			"Waffles, with your choice of blueberries or strawberries",
			true,
			3.59));

		dinerMenu.addMenuComponent(new MenuItem(
			"Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", 
			true, 
			2.99));
		dinerMenu.addMenuComponent(new MenuItem(
			"BLT",
			"Bacon with lettuce & tomato on whole wheat", 
			false, 
			2.99));
		dinerMenu.addMenuComponent(new MenuItem(
			"Soup of the day",
			"A bowl of the soup of the day, with a side of potato salad", 
			false, 
			3.29));
		dinerMenu.addMenuComponent(new MenuItem(
			"Hotdog",
			"A hot dog, with saurkraut, relish, onions, topped with cheese",
			false, 
			3.05));
		dinerMenu.addMenuComponent(new MenuItem(
			"Steamed Veggies and Brown Rice",
			"A medly of steamed vegetables over brown rice", 
			true, 
			3.99));
 
		dinerMenu.addMenuComponent(new MenuItem(
			"Pasta",
			"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
			true, 
			3.89));
   
		dinerMenu.addMenuComponent(dessertMenu);
  
		dessertMenu.addMenuComponent(new MenuItem(
			"Apple Pie",
			"Apple pie with a flakey crust, topped with vanilla icecream",
			true,
			1.59));
		dessertMenu.addMenuComponent(new MenuItem(
			"Cheesecake",
			"Creamy New York cheesecake, with a chocolate graham crust",
			true,
			1.99));
		dessertMenu.addMenuComponent(new MenuItem(
			"Sorbet",
			"A scoop of raspberry and a scoop of lime",
			true,
			1.89));

		cafeMenu.addMenuComponent(new MenuItem(
			"Veggie Burger and Air Fries",
			"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
			true, 
			3.99));
		cafeMenu.addMenuComponent(new MenuItem(
			"Soup of the day",
			"A cup of the soup of the day, with a side salad",
			false, 
			3.69));
		cafeMenu.addMenuComponent(new MenuItem(
			"Burrito",
			"A large burrito, with whole pinto beans, salsa, guacamole",
			true, 
			4.29));
 
		Waitress waitress = new Waitress(allMenus);
   
		waitress.printVegetarianMenu();
 
	}
}
