package ex034.q05;

public class UpperCaseProcessor extends TextProcessor{

    public UpperCaseProcessor() {
        super("Upper Case Step");
    }

    @Override
    public String process(String input) throws InvalidInputException {
        if(input == null || input.trim().equals("")) throw new InvalidInputException();
        return input.toUpperCase();
    }
    
}
