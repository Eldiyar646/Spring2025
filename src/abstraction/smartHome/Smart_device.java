package abstraction.smartHome;

public interface Smart_device {

    String DEFAULT_LOCATION = "Living room";

    void turn_on();

    void turn_off();

    default void reset() {
        log("Reset all devices in " + DEFAULT_LOCATION);
        turn_off();
        turn_on();
    }

    static void diagnostics() {
        System.out.println("All devices are scanning");
    }

    private void log(String message) {
        System.out.println("[LOG] " + message);
    }
}