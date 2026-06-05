package ex030;

public class HighRiskAnalyzer implements IRiskAnalyzer{

    @Override
    public void analyze() {
        System.out.println("This transaction has high risk");
    }
    
}
