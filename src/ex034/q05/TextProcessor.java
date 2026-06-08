package ex034.q05;

public abstract class TextProcessor {
    private String step;
    public TextProcessor(String step){
        this.step = step;
    }
    public abstract String process(String input) throws InvalidInputException;
    public String stepName(){
        return step;
    }
}
