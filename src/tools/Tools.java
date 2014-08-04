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
