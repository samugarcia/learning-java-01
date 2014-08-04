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
