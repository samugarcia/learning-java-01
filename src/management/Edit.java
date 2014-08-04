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

import exceptions.NoRouteException;
import exceptions.NoVehicleException;

import exceptions.TypeRouteException;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Bus;
import model.Circular;
import model.Linear;
import model.Route;
import model.Tram;
import model.Vehicle;

import tools.Tools;

public class Edit {
    public static void addRoute() {
        Scanner en = new Scanner(System.in);
        Scanner enL = new Scanner(System.in);
        String routeId, vehicleType, routeType;
        
        System.out.println("Insert route identification code:");
        routeId = en.next();
        do {
            System.out.println("Insert vehicle type (b for bus, t for tram):");
            vehicleType = en.next();
        } while (!vehicleType.equals("b") && !vehicleType.equals("t"));
        do {
            System.out.println("Insert route type (l for linear, c for circular):");
            routeType = en.next();
        } while (!routeType.equals("l") && !routeType.equals("c"));
        if (routeType.equals("l")) {
            String fStation, lStation;
            double kmF2L;
            
            System.out.println("Insert name of the first station:");
            fStation = enL.nextLine();
            System.out.println("Insert name of the last station:");
            lStation = enL.nextLine();
            try {
                System.out.println("Insert distance between first and last station in Km:");
                kmF2L = en.nextDouble(); // posible error decimal .
                
                Linear r1 = new Linear(routeId, vehicleType, fStation, lStation, kmF2L);
                Data.routes.add(r1);
                System.out.println("Route added correctly.\n");
            } catch (InputMismatchException e1) {
               System.out.println("Error: you have entered a number with dot '.' as decimal separator, however you " +
                   "have to use comma ',' for that.");
               System.out.println("Please, try again.");
               Tools.pause();
           }
        } else if (routeType.equals("c")) {
            String name;
            double perimeterLength;
            
            System.out.println("Insert route name:");
            name = enL.nextLine();
            try {
                System.out.println("Insert perimeter length of the route in Km:");
                perimeterLength = en.nextDouble(); // posible error decimal .
                
                Circular r1 = new Circular(routeId, vehicleType, name, perimeterLength);
                Data.routes.add(r1);
                System.out.println("Route added correctly.\n");
            } catch (InputMismatchException e1) {
                System.out.println("Error: you have entered a number with dot '.' as decimal separator, however you " +
                    "have to use comma ',' for that.");
                System.out.println("Please, try again.");
                Tools.pause();
            }
            
        }
    }
    
    public static void addVehicle() {
        Scanner en = new Scanner(System.in);
        String registration, vehicleType, option;
        int purchaseYear, purchaseMonth, purchaseDay;
        
        try {
            System.out.println("Insert vehicle registration [matrícula]:");
            registration = en.next();
            System.out.println("Insert purchase year:");
            purchaseYear = en.nextInt();
            System.out.println("Insert purchase month (1-12):");
            purchaseMonth = en.nextInt();
            System.out.println("Insert purchase day:");
            purchaseDay = en.nextInt();
            do {
                System.out.println("Insert vehicle type (b for bus, t for tram):");
                vehicleType = en.next();
            } while (!vehicleType.equals("b") && !vehicleType.equals("t"));
            if (vehicleType.equals("b")) {
                int speed, seats;
                double length;
                
                System.out.println("Insert max speed in Km/h:");
                speed = en.nextInt();
                System.out.println("Insert bus length in m:"); // posible error decimal .
                length = en.nextDouble();
                System.out.println("Insert amount of seats:");
                seats = en.nextInt();
                
                Bus v1 = new Bus(registration, purchaseYear, purchaseMonth, purchaseDay, speed, length, seats);
                Data.vehicles.add(v1);
                System.out.println("Vehicle added correctly.\n");
            } else if (vehicleType.equals("t")) {
                int carsAmount;
                
                System.out.println("Insert amount of tram cars:");
                carsAmount = en.nextInt();
                
                Tram v1 = new Tram(registration, purchaseYear, purchaseMonth, purchaseDay, carsAmount);
                Data.vehicles.add(v1);
                System.out.println("Vehicle added correctly.\n");
            }
            do {
                System.out.println("Do you want to assign a route to this vehicle right now? (y for yes, n for no):");
                option = en.next();
            } while (!option.equals("y") && !option.equals("n"));
            if (option.equals("y")) assignRoute(registration);
        } catch (InputMismatchException e1) {
            System.out.println("Error: you have entered a number with dot '.' as decimal separator, however you " +
                "have to use comma ',' for that.");
            System.out.println("Please, try again.");
            Tools.pause();
        }
        
    }

    public static void assignRoute(String vehicleReg) {
        Scanner en = new Scanner(System.in);
        String registration, routeId;
        Vehicle v1;
        Route r1;
            
        try {
            if (vehicleReg.equals("none")) {
                System.out.println("Insert vehicle registration:");
                registration = en.next();
            } else {
                registration = vehicleReg;
            }
            v1 = Tools.getVehicle(registration); // posible NoVehicleException
            
            System.out.println("Insert route identification code:");
            routeId = en.next();
            r1 = Tools.getRoute(routeId); // posible NoRouteException
            
            v1.setRoute(r1); //posible TypeRouteException
            System.out.println("Route assigned correctly.\n");
        } catch (NoVehicleException e1) {
            System.out.println("Error: "+e1.getMessage());
            Tools.pause();
        } catch (NoRouteException e1) {
            System.out.println("Error: "+e1.getMessage());
            Tools.pause();
        } catch (TypeRouteException e1) {
            System.out.println("Error: "+e1.getMessage());
            Tools.pause();
        }
    }
    
    public static void increaseBreaks() {
        Scanner en = new Scanner(System.in);
        String registration;
        
        System.out.println("Insert vehicle registration:");
        registration = en.next();
        try {
            Vehicle v1 = Tools.getVehicle(registration); // posible NoRouteException
            v1.increaseBreaks();
            System.out.println("Breakdowns counter increased correctly.\n");
        } catch (NoVehicleException e1) {
            System.out.println("Error: "+e1.getMessage());
            Tools.pause();
        }
    }
}
