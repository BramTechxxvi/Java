package exceptions;

public class DetailsAlreadyInUseException extends GatePassException{

    public DetailsAlreadyInUseException(String message) {
        super(message);
    }
}
