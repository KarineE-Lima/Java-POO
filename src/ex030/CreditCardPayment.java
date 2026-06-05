package ex030;

public class CreditCardPayment implements IPayment{
    private double value;
    private String accountNumber;
    private String payDay;

    public CreditCardPayment(double value, String accountNumber, String payDay){
        this.value = value;
        this.accountNumber = accountNumber;
        this.payDay = payDay;
    }

    @Override
    public void displayInformations() {
        System.out.printf("[Value: %.2f, Account Number: %s, Payday: %s]\n", value, accountNumber, payDay);
    }

    @Override
    public IPaymentProcessor getProcessor() {
       return new CreditCardProcessor();
    }
    
}
