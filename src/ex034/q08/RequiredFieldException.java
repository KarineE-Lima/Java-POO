package ex034.q08;

public class RequiredFieldException extends ValidationException{

    public RequiredFieldException(String message, String field) {
        super(message, field, "RequiredField");
    }
    
}
