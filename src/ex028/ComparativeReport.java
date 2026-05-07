package ex028;
import java.util.*;

public class ComparativeReport{
    List<AnalysisResult> results;
    public ComparativeReport(){
        results = new ArrayList<>();
    }
    public void newAnalysis(AnalysisResult result){
        results.add(result);
    }
}
