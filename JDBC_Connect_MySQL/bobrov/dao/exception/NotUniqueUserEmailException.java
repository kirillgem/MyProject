package bobrov.dao.exception;

public class NotUniqueUserEmailException extends DBException {
    public NotUniqueUserEmailException(String message) {
        super(message);
    }

    public NotUniqueUserEmailException(String message, Throwable cause){
        super(message, cause);
    }
}
