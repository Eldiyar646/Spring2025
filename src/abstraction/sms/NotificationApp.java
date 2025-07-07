package abstraction.sms;

public class NotificationApp {
    public static void main(String[] args) {

        Notifier email = new EmailNotifier();
        Notifier sms = new SMS_Notifier();

        email.send("Welcome");
        sms.sendDefault();


        Notifier.showSystemInfo();

    }
}