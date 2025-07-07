package abstraction.sms;

public class SMS_Notifier implements Notifier{

    @Override
    public void send(String message) {
        System.out.println("SMS is sending: " + message);
    }
}
