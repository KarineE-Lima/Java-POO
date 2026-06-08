package ex034.q08;

public class InvalidFormatException extends ValidationException{
    public InvalidFormatException(String message, String field){
        super(message, field, "InvalidFormat");
    }
}
