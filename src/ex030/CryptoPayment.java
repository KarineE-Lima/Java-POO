package ex030;

public class CryptoPayment implements IPayment{
    private double value;
    private String walletAddress;
    private String type;

    public CryptoPayment(double value, String walletAddress, String type){
        this.value = value;
        this.walletAddress = walletAddress;
        this.type = type;
    }


    @Override
    public void displayInformations() {
        System.out.printf("[Value: %.2f, Wallet Address: %s, Type: %s]\n", value, walletAddress, type);
    }
    @Override
    public IPaymentProcessor getProcessor() {
        return new CryptoProcessor();
    }
}
