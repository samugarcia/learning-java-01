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
