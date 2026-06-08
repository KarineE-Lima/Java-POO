package ex034.q04;

public class PushNotifier implements Notifier{
    private String token;
    public PushNotifier (String token){
        this.token = token;
    }
    @Override
    public void send(String message) throws NotificationException {
        if(token == null || token.startsWith("evice")) throw new NotificationException();
        System.out.println("New Push Message for " + token + ": " + message);    
    }
}
