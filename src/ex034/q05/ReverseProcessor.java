package ex034.q05;

public class ReverseProcessor extends TextProcessor{

    public ReverseProcessor() {
        super("Reverse Step");
    }

    @Override
    public String process(String input) throws InvalidInputException {
        if(input == null || input.trim().equals("")) throw new InvalidInputException();
        return new StringBuilder(input).reverse().toString();
    }
    
}
