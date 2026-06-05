package ex030;

public class LowRiskAnalyzer implements IRiskAnalyzer{

    @Override
    public void analyze() {
        System.out.println("This transaction has low risk");
    }
    
}
