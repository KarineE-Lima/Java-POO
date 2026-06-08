package ex034.q08;

public class MinLengthValidator extends Validator{
    private int minLength;
    public MinLengthValidator(String field, int minLength){
        super(field);
        this.minLength = minLength;
    }
    @Override
    public void validate(String value) throws ValidationException{
        if(value.length() < minLength) throw new MinLengthException("Min length is " + minLength, fieldName());
        System.out.println("Field " + fieldName() + " is valid!");
    }
}
