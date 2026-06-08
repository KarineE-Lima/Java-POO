package ex034.q08;

public class MinLengthException extends ValidationException{
    public MinLengthException(String message, String field){
        super(message, field, "MinLength");
    }
}
