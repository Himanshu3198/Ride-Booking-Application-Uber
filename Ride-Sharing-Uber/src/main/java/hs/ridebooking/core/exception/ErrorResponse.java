package hs.ridebooking.core.exception;

public class ErrorResponse {

    private ErrorCode errorCode;
    private String message;
    private String help;

    public ErrorResponse(ErrorCode errorCode, String message, String help) {
        this.errorCode = errorCode;
        this.message = message;
        this.help = help;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }
}
