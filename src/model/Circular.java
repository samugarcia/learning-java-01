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

public class Circular extends Route {
    String name;
    double perimeterLength;
    
    public Circular(String routeId, String vehicleType, String name, double perimeterLength) {
        super(routeId, vehicleType);
        this.name = name;
        this.perimeterLength = perimeterLength;
    }
    
    public String getName() {
        return name;
    }
    
    public double getLength() {
        return perimeterLength;
    }
}
