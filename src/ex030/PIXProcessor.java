package ex030;

public class PIXProcessor implements IPaymentProcessor{
    @Override
    public void processPayment(IPayment payment){
        System.out.println("Processing PIX Payment...");
        payment.displayInformations();
    }
}
