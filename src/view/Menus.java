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

package view;

import java.util.Scanner;

public class Menus {
    public static int mainMenu() {
        Scanner en = new Scanner(System.in);
        int option;
                
        do {
            System.out.println("############## MAIN MENU ###############");
            System.out.println("1: Add or modify elements");
            System.out.println("2: Show information");
            System.out.println("0: Exit");
            System.out.println("Insert option:");
            option = en.nextInt();
        } while (option < 0 || option > 2);
        return option;
    }
    
    public static int editMenu() {
        Scanner en = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("############## EDIT MENU ###############");
            System.out.println("1: Add route");
            System.out.println("2: Add vehicle");
            System.out.println("3: Assign or modify vehicle route");
            System.out.println("4: Increase vehicle breakdowns counter");
            System.out.println("0: Back");
            System.out.println("Insert option:");
            option = en.nextInt();
        } while (option < 0 || option > 4);
        return option;
    }
    
    public static int showMenu() {
        Scanner en = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("############## SHOW MENU ###############");
            System.out.println("1: Show routes list");
            System.out.println("2: Show vehicles list");
            System.out.println("0: Back");
            System.out.println("Insert option:");
            option = en.nextInt();
        } while (option < 0 || option > 2);
        return option;
    }
}
