package ex028;

import java.util.*;

public class AnalyticsPipeline {
    public AnalysisResult executeAnalysis(IDataAnalyzer analysis, IDataSource data){
        return new AnalysisResult(analysis.analyzer() + data.getData());
    }
    public List<AnalysisResult> executeBatchAnalysis(Map<IDataAnalyzer,IDataSource> data){
        List<AnalysisResult> results = new ArrayList<>();
        data.forEach((IDataAnalyzer, IDataSource)->
            results.add(executeAnalysis(IDataAnalyzer, IDataSource))
        );
        return results;
    }
    public ComparativeReport generateComparativeReport(List<IDataAnalyzer> analysis, IDataSource data){
        ComparativeReport report = new ComparativeReport();
        for(IDataAnalyzer a : analysis){
            report.newAnalysis(executeAnalysis(a, data));
        }
        return report;
    }
}
