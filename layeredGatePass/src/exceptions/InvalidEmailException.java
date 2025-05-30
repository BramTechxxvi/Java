package exceptions;

public class InvalidEmailException extends GatePassException{

    public InvalidEmailException(String message) {
        super(message);
    }
}
