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
