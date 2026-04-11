package ex014;

public class App {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister("caixa18");
        cashRegister.processPayment(10.90, "Compra de batata");
        cashRegister.processPayment(18);
        cashRegister.processPayment(75.80);
        cashRegister.processRefund(0.80);
        System.out.println(cashRegister.getDailyReport());
    }
}
