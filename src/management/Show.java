package management;

import java.util.Scanner;

import model.Route;
import model.Vehicle;

import tools.Tools;

public class Show {
    public static void showRoutes() {
        for (int i = 0; i < Data.routes.size(); i++) {
            Route r1 = (Route) Data.routes.get(i);
            
            System.out.println((i+1)+" ---------------------------------------");
            System.out.println("Identification code: "+r1.getId());
            System.out.println("Name: "+r1.getName());
            System.out.println("Route type: "+r1.getType());
            System.out.println("Vehicle type: "+r1.getVehicleType());
            System.out.println("Length: "+r1.getLength()+" Km");
        }
        Tools.pause();
    }
    
    public static void showVehicles() {
        for (int i = 0; i < Data.vehicles.size(); i++) {
            Vehicle v1 = (Vehicle) Data.vehicles.get(i);
            
            System.out.println((i+1)+" ---------------------------------------");
            System.out.println("Vehicle registration: "+v1.getRegistration());
            System.out.println("Purchase date: "+v1.getPurchaseDate());
            System.out.println("Vehicle type: "+v1.getType());
            System.out.println("Seats amount: "+v1.getSeats());
            System.out.println("Breakdowns amount: "+v1.getBreaks());
            System.out.println(v1.getInfo());
            System.out.println("Route: "+v1.getRoute());
        }
        Tools.pause();
    }
}
