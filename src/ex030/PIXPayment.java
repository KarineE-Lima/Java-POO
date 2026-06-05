package ex030;

public class PIXPayment implements IPayment{
    private double value;
    private String pixKey;

    public PIXPayment(double value, String pixKey){
        this.value = value;
        this.pixKey = pixKey;
    }

    @Override
    public void displayInformations() {
        System.out.printf("[Value: %.2f, Pix Key: %s]\n", value, pixKey);
    }
    @Override
    public IPaymentProcessor getProcessor() {
        return new PIXProcessor();
    }


}
