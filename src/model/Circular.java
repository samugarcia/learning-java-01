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
