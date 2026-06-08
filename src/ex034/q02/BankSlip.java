package ex034.q02;

public class BankSlip implements Payable{
    private String date;

    public BankSlip(String date){
        this.date = date;
    }

    @Override
    public void pay(double amount){
        System.out.println("Payment of " + amount + " made with Bank Slip of expiration date: " + date);
    }
}
