package ex030;

public class CryptoProcessor implements IPaymentProcessor{

    @Override
    public void processPayment(IPayment payment) {
        System.out.println("Processing Crypto Payment...");
        payment.displayInformations();
    }
    
}
