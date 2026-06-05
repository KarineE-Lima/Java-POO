package ex030;

public interface IPayment {
    public abstract void displayInformations();
    public abstract IPaymentProcessor getProcessor();
}
