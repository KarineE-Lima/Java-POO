package ex014;

public class CashRegister {
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    public CashRegister(String registerId){
        this.registerId = registerId;
        this.transactionCount = 0;
        this.currentBalance = 0;
    }
    public CashRegister(String registerId, double currentBalance){
        this(registerId);
        this.currentBalance = currentBalance;
    }
    
    public CashRegister(String registerId, double currentBalance, int transactionCount){
        this(registerId, currentBalance);
        this.transactionCount = transactionCount;
    }

    public void processPayment(double payment){
        this.currentBalance += payment;
        this.transactionCount++;
    }
    public void processPayment(int payment){
        this.currentBalance += payment;
        this.transactionCount++;
    }
    public void processPayment(double payment, String description){
        this.currentBalance += payment;
        this.transactionCount++;
        System.out.println("Pagamento processado: " + description);
    }

    public void processRefund(double refund){
        this.currentBalance -= refund;
        this.transactionCount++;
    }
    public void processRefund(int refund){
        this.currentBalance -= refund;
        this.transactionCount++;
    }
    public void processRefund(double refund, String description){
        this.currentBalance -= refund;
        this.transactionCount++;
        System.out.println("Reembolso processado: " + description);
    }

    public String getDailyReport(){
        return "Id da Conta: "+ getRegisterId() + "\nTotal de Transações: " + getTransationCount() + "\nValor Total em Caixa: " + getCurrentBalance() + "\n";
    }
    public String getRegisterId(){
        return this.registerId;
    }
    public int getTransationCount(){
        return this.transactionCount;
    }
    public double getCurrentBalance(){
        return this.currentBalance;
    }
    public void setRegisterId(String registerId){
        this.registerId = registerId;
    }
    public void setTransationCount(int transactionCount){
        this.transactionCount = transactionCount;
    }
    public void setCurrentBalance(double currentBalance){
        this.currentBalance = currentBalance;
    }
}
