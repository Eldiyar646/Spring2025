package abstraction.smartHome;

public class Home_Up_Mine {
    public static void main(String[] args) {

        Smart_device tv = new Smart_TV();
        Smart_device heater = new Smart_Heater();

        tv.turn_on();
        tv.turn_off();
        tv.reset();

        heater.turn_on();
        heater.turn_off();
        heater.reset();

        Smart_device.diagnostics();





    }
}
