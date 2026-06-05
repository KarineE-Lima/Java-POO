package ex030;

public class MediumRiskAnalyzer implements IRiskAnalyzer{

    @Override
    public void analyze() {
        System.out.println("This transaction has medium risk");
    }
    
}
