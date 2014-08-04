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
