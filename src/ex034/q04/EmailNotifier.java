package ex034.q04;

public class EmailNotifier implements Notifier{
    private String emailAdress;
    public EmailNotifier(String emailAdress){
        this.emailAdress = emailAdress;
    }

    @Override
    public void send(String message) throws NotificationException {
        if(emailAdress == null) throw new NotificationException();
        System.out.println("New E-mail Message for " + emailAdress + ": " + message);
    }
    
}
