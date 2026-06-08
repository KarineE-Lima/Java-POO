package ex034.q04;

public class Main {
    public static void main(String[] args) {
        Notifier[] notifiers = { 
            new EmailNotifier(null), 
            new SmsNotifier("11999999999"), 
            new PushNotifier("evice-token-xyz") 
        };
        for (Notifier n : notifiers) {
            try {
                n.send("Sua compra foi confirmada!"); // pode lançar NotificationException
            } catch (NotificationException e) {
                System.out.println("Falha ao notificar: " + e.getMessage());
            }
        }
    }
}
