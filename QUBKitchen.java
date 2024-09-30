package part01;

public class QUBKitchen {

	public static void main(String[] args) {
		Menu mainMenu = new Menu("QUB Kitchen", Resources.mainOptions);
		int choice = 0;
		boolean quit = false;
		do {
			choice = mainMenu.getUserChoice();
			quit = processChoice(choice);
		} while (!quit);

		System.out.println("All done - Goodbye!");
	}

	private static boolean processChoice(int choice) {
		boolean quit = false;
		switch (choice) {
		case 1:
			manageIngredients();
			break;
		case 2:
			manageRecipes();
			break;
		case 3:
			manageWeeklyMenu();
			break;
		case 4:
			quit = true;
		}
		return quit;
	}

	private static void manageIngredients() {
		System.out.println("Manage Ingredients");
	}

	private static void manageRecipes() {
		System.out.println("Manage Recipes");
	}

	private static void manageWeeklyMenu() {
		System.out.println("Manage Weekly Menu");
	}
}
