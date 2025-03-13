package Excepciones;

public class IdentificadorDuplicadoException extends Exception {
    public IdentificadorDuplicadoException(String message) {
        super("Identificador duplicado");
    }
}
