package management;

import view.Menus;

public class Management {
    public void mainMenuController() {
        int option;

        do {
            option = Menus.mainMenu();
            switch (option) {
            case 1:
                editMenuController();
                break;
            case 2:
                showMenuController();
                break;
            default:
                break;
            }
        } while (option != 0);
        System.out.println("Thank you for using me. Good bye.");
    }

    public void editMenuController() {
        int option;

        do {
            option = Menus.editMenu();
            switch (option) {
            case 1:
                Edit.addRoute();
                break;
            case 2:
                Edit.addVehicle();
                break;
            case 3:
                Edit.assignRoute("none");
                break;
            case 4:
                Edit.increaseBreaks();
                break;
            default:
                break;
            }
        } while (option != 0);
    }
    
    public void showMenuController() {
        int option;

        do {
            option = Menus.showMenu();
            switch (option) {
            case 1:
                Show.showRoutes();
                break;
            case 2:
                Show.showVehicles();
                break;
            default:
                break;
            }
        } while (option != 0);
    }
}
