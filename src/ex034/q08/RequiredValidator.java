package ex034.q08;

public class RequiredValidator extends Validator{
    public RequiredValidator(String field){
        super(field);
    }
    @Override
    public void validate(String value) throws ValidationException{
        if(value == null || value.trim().equals("")) throw new RequiredFieldException("Field cannot be void", fieldName());
        System.out.println("Field " + fieldName() + " is valid!");
    }
}
