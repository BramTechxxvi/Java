package exceptions;

public class InvalidPhoneNumberException extends GatePassException{

    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
