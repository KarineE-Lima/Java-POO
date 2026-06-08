package ex034.q08;

public class ValidationException extends Exception{
    private String field;
    private String errorCode;
    public ValidationException(String message, String field, String errorCode){
        super(message);
        this.field = field;
        this.errorCode = errorCode;
    }
    public String fieldName(){
        return field;
    }
    public String errorCode(){
        return errorCode;
    }
}
