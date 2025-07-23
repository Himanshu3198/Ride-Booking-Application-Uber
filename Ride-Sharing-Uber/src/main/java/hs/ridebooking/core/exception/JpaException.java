package hs.ridebooking.core.exception;

public class JpaException extends RuntimeException {
    public JpaException(String message) {
        super(message);
    }
}
