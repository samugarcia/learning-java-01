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

import management.Data;

public class Bus extends Vehicle {
    private int speed; // velocidad maxima en Km por hora
    private double length; // largo del vehiculo
    private int seats; // asientos
    
    public Bus(String vehicleRegistration, int purchaseYear, int purchaseMonth, int purchaseDay, int speed,
               double length, int seats) {
        super(vehicleRegistration, purchaseYear, purchaseMonth, purchaseDay);
        this.speed = speed;
        this.length = length;
        this.seats = seats;
    }
    
    public int getSeats() {
        return seats;
    }
    
    public String getInfo() {
        return "Max speed: "+speed+"Km/h\nBus length: "+length+"m";
    }
}
