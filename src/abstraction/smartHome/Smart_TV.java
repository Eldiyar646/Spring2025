package abstraction.smartHome;

public class Smart_TV implements Smart_device{
    @Override
    public void turn_on() {
        System.out.println("TV is turn on");
    }

    @Override
    public void turn_off() {
        System.out.println("TV is turn off");

    }
}
