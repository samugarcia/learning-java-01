package exceptions;

public class NoRouteException extends Exception {
    public NoRouteException() {
        super("There is no route that matches the search");
    }
}
