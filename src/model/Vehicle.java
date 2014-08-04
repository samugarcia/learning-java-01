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

package model;

import exceptions.TypeRouteException;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Vehicle {
    private String registration; // matricula
    private GregorianCalendar purchaseDate;
    private int breakdownsAmount; // cantidad de averias
    private Route route;

    public Vehicle(String vehicleRegistration, int purchaseYear, int purchaseMonth, int purchaseDay) {
        registration = vehicleRegistration;
        purchaseDate = new GregorianCalendar(purchaseYear, purchaseMonth - 1, purchaseDay);
        breakdownsAmount = 0;
    }

    public String getRegistration() {
        return registration;
    }

    public String getPurchaseDate() {
        return purchaseDate.get(Calendar.DAY_OF_MONTH) + "-" + purchaseDate.get(Calendar.MONTH + 1) + "-" +
               purchaseDate.get(Calendar.YEAR);
    }

    public int getBreaks() {
        return breakdownsAmount;
    }

    public String getRoute() {
        if (route == null)
            return "unassigned route";
        else
            return route.getId();
    }

    public abstract int getSeats();

    public abstract String getInfo();
    
    public String getType() {
        if (this instanceof Bus) return "bus";
        else if (this instanceof Tram) return "tram";
        else return "unkonwn vehicle type";
    }
    
    public void setRoute(Route route) throws TypeRouteException {
        if (route.getVehicleType().equals(this.getType())) {
            this.route = route;
        } else {
            throw new TypeRouteException();
        }
    }
    
    public void increaseBreaks() {
        breakdownsAmount++;
    }
}
