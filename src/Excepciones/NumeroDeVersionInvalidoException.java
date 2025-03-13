package Excepciones;

public class NumeroDeVersionInvalidoException extends Exception {
    public NumeroDeVersionInvalidoException(String message) {
        super("Numero de versión inválido");
    }
}
