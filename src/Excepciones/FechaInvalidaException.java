package Excepciones;

public class FechaInvalidaException extends Exception {
    public FechaInvalidaException(String message) {
        super("Fecha invalida");
    }
}
