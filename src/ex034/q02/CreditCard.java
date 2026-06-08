package ex034.q02;

public class CreditCard implements Payable{
    private String numberCard;
    private double limit;

    public CreditCard(String numberCard, double limit){
        this.numberCard = numberCard;
        this.limit = limit;
    }

    @Override
    public void pay(double amount){
        if(limit - amount < 0){
            System.out.println("Insufficient limit!");
            return;
        } 
        limit -= amount;
        System.out.println("Payment of " + amount + " made with Credit Card: " + numberCard);
    }
}
