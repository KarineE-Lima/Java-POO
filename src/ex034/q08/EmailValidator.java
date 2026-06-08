package ex034.q08;

public class EmailValidator extends Validator{
    public EmailValidator(String field){
        super(field);
    }
    @Override
    public void validate(String value) throws ValidationException{
        if(!value.contains("@")) throw new InvalidFormatException("Invalid Format Field", fieldName());
        System.out.println("Field " + fieldName() + " is valid!");
    }
}
