package ex030;

public class CreditCardProcessor implements IPaymentProcessor{

    @Override
    public void processPayment(IPayment payment) {
        System.out.println("Processing Credit Card Payment...");
        payment.displayInformations();
    }
    
}