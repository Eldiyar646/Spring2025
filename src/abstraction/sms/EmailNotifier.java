package abstraction.sms;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Email is sending: " + message);
    }
}
