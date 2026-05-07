package ex028;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataAnalyticsApp {
     public static void main(String[] args) { 
        AnalyticsPipeline pipeline = new AnalyticsPipeline(); 
         
        // Diferentes combinações de algoritmos e fontes 
        AnalysisResult result1 = pipeline.executeAnalysis( 
            new MLRegressionAnalyzer(),  
            new DatabaseDataSource("sales_db") 
        ); 
         
        AnalysisResult result2 = pipeline.executeAnalysis( 
            new StatisticalAnalyzer(), 
            new FileDataSource("data.csv") 
        ); 
         
        AnalysisResult result3 = pipeline.executeAnalysis( 
            new NeuralNetworkAnalyzer(), 
            new APIDataSource("https://api.data.com") 
        ); 
         
        // Processamento em lote com múltiplas combinações 
        Map<IDataAnalyzer, IDataSource> analysisJobs = new LinkedHashMap<>(); 
        analysisJobs.put(new MLRegressionAnalyzer(), 
                         new DatabaseDataSource("db1")); 
        analysisJobs.put(new StatisticalAnalyzer(), 
                         new FileDataSource("file1.csv")); 
         
        List<AnalysisResult> batchResults =  pipeline.executeBatchAnalysis(analysisJobs); 
         
        // Análise comparativa 
        ComparativeReport report = pipeline.generateComparativeReport( 
            Arrays.asList(new MLRegressionAnalyzer(), 
                          new StatisticalAnalyzer()), 
            new DatabaseDataSource("comparison_db") 
        ); 
    }
}
