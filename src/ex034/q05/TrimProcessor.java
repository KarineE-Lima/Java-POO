package ex034.q05;

public class TrimProcessor extends TextProcessor{

    public TrimProcessor() {
        super("Trim Step");
    }

    @Override
    public String process(String input) throws InvalidInputException {
        if(input == null || input.trim().equals("")) throw new InvalidInputException();
        return input.trim();
    }
    
}
