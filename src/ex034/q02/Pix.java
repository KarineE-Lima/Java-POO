package ex034.q02;

public class Pix implements Payable{
    private String key;

    public Pix(String key){
        this.key = key;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made with Pix Key: " + key);
    }
    
}
