package model;

public class Linear extends Route {
    private String fStation; // first station name
    private String lStation; // lastt station name
    private double kmF2L; // km from first to last station

    public Linear(String routeId, String vehicleType, String fStation, String lStation, double kmF2L) {
        super(routeId, vehicleType);
        this.fStation = fStation;
        this.lStation = lStation;
        this.kmF2L = kmF2L;
    }
    
    public String getName() {
        return fStation+" - "+lStation;
    }
    
    public double getLength() {
        return kmF2L * 2;
    }
}
