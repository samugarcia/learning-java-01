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

public abstract class Route {
    private String id;
    private String vehicleType;

    public Route(String routeId, String vehicleType) {
        this.id = routeId;
        this.vehicleType = vehicleType;
    }
    
    public String getId() {
        return id;
    }
    
    public String getVehicleType() {
        String returnVehicle;
        if (vehicleType.equals("b")) returnVehicle = "bus";
        else if (vehicleType.equals("t")) returnVehicle = "tram";
        else returnVehicle = "unkonwn";
        return returnVehicle;
    }
    
    public abstract String getName();
    
    public abstract double getLength();
    
    public String getType() {
        if (this instanceof Linear) return "linear";
        else if (this instanceof Circular) return "circular";
        else return "unkonwn route type";
    }
}
