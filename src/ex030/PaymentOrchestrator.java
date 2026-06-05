package ex030;

import java.util.*;

// faz todos os processos de pagamento
public class PaymentOrchestrator {
    private List<IPaymentProcessor> processors = new ArrayList<IPaymentProcessor>();
    private Map<String, IRiskAnalyzer> riskAnalyzers = new HashMap<>();
    
    public void registerPaymentProcessor(IPaymentProcessor processor){
        processors.add(processor);
    }
    public void registerRiskAnalyzer(String keyRisk, IRiskAnalyzer riskAnalyzer){
        riskAnalyzers.put(keyRisk, riskAnalyzer);
    }
    // Processamento - o próprio PAGAMENTO determina qual processador usar
    public PaymentResult processPayment(IPayment payment, String keyRisk){
        IPaymentProcessor processor = payment.getProcessor();
        IRiskAnalyzer riskAnalyzer = riskAnalyzers.get(keyRisk);
        processor.processPayment(payment);
        riskAnalyzer.analyze();
        return new PaymentResult(payment, processor, riskAnalyzer);
    }  
    public  List<PaymentResult> processBatch(List<IPayment> batchPayments, String keyRisk){
        List<PaymentResult> results = new ArrayList<>();
        for (IPayment payment : batchPayments) {
            results.add(processPayment(payment, keyRisk));
        }
        return results;
    }


}
