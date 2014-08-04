package exceptions;

public class NoVehicleException extends Exception {
    public NoVehicleException() {
        super("There is no vehicle that matches the search");
    }
}
