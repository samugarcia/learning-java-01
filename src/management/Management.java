/*
 * Copyright (C) 2014 by Samuel Garcia
 * samugarcia.it at gmail dot com - www.samugarcia.com
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

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
