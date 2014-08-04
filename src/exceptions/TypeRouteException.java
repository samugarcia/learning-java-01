package exceptions;

public class TypeRouteException extends Exception {
    public TypeRouteException() {
        super("Route incompatible with that vehicle");
    }
}
