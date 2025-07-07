package abstraction.smartHome;

public class Smart_Heater implements Smart_device{

    @Override
    public void turn_on() {
        System.out.println("Heater is turn on");

    }

    @Override
    public void turn_off() {
        System.out.println("Heater is turn off");
    }
}
