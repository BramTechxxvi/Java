package exceptions;

public class InvalidCredentialsException extends GatePassException{

    public InvalidCredentialsException(String message) {
        super(message);
    }
}
