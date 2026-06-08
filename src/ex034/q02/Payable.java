package ex034.q02;

public interface Payable {
    public void pay(double amount);
    public default void receipt(){
        System.out.println("Payment Received!");
    }
}
