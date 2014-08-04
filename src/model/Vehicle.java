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
