package tools;

import exceptions.NoRouteException;
import exceptions.NoVehicleException;

import java.util.Scanner;

import management.Data;

import model.Route;
import model.Vehicle;

public class Tools {
    public static void pause() {
        Scanner en = new Scanner(System.in);
        String anyKey;
        
        System.out.println("\nPress any letter to continue...");
        anyKey = en.next();
    }
    
    public static Vehicle getVehicle(String registration) throws NoVehicleException {
        int i = 0;
        Vehicle v1;
        Vehicle vehicle = null;
        
        while (vehicle == null && i < Data.vehicles.size()) {
            v1 = (Vehicle) Data.vehicles.get(i);
            if (v1.getRegistration().equals(registration)) {
                vehicle = v1;
            }
            i++;
        }
        if (vehicle == null) {
            throw new NoVehicleException();
        } else {
            return vehicle;
        }
    }
    
    public static Route getRoute(String routeId) throws NoRouteException {
        int i = 0;
        Route r1;
        Route route = null;
        
        while (route == null && i < Data.routes.size()) {
            r1 = (Route) Data.routes.get(i);
            if (r1.getId().equals(routeId)) {
                route = r1;
            }
            i++;
        }
        if (route == null) {
            throw new NoRouteException();
        } else {
            return route;
        }
    }
}
