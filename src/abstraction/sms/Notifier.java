package abstraction.sms;

public interface Notifier {

    String SYSTEM_SENDER = "Admin";

    void send(String message);

    default void sendDefault(){
        log("Send standard message");
        send("Hello from " + SYSTEM_SENDER);

    }

    static void showSystemInfo(){
        System.out.println("show system info is ACTIVE");
    }

    private void log(String message) {
        System.out.println("[LOG]" + message);
    }

}
