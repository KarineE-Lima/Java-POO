package ex034.q04;

public class SmsNotifier implements Notifier{
    private String number;
    public SmsNotifier(String number){
        this.number = number;
    } 

    @Override
    public void send(String message) throws NotificationException {
       if(number == null) throw new NotificationException();
        System.out.println("New SMS Message for " + number + ": " + message);
    }
    
}
