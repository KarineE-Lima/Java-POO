package ex030;
// Processador do pagamento
public class PaymentResult {
    private IPayment payment;
    private IPaymentProcessor processor;
    private IRiskAnalyzer riskAnalyzer;

    public PaymentResult(IPayment payment, IPaymentProcessor processor, IRiskAnalyzer riskAnalyzer){
        this.payment = payment;
        this.processor = processor;
        this.riskAnalyzer = riskAnalyzer;
    }
}
