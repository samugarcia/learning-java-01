package model;

import management.Data;

public class Tram extends Vehicle{
    private int carsAmount; // cantidad de vagones
    
    public Tram(String vehicleRegistration, int purchaseYear, int purchaseMonth, int purchaseDay, int carsAmount) {
        super(vehicleRegistration, purchaseYear, purchaseMonth, purchaseDay);
        this.carsAmount = carsAmount;
    }
    
    public int getSeats() {
        return carsAmount * Data.seatsPerTramCar;
    }
    
    public String getInfo() {
        return "Tram cars amount: "+carsAmount;
    }
}
