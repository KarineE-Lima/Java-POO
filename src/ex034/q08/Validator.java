package ex034.q08;

public abstract class Validator {
    private String field;
    public Validator(String field){
        this.field = field;
    }
    public String fieldName(){
        return field;
    }
    public abstract void validate(String value) throws ValidationException;
}
