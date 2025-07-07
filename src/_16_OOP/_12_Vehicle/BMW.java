package _16_OOP._12_Vehicle;

public class BMW extends Car{

    public BMW(int id, String mark, String model, String color, boolean m_package) {
        super(id, mark, model, color);
        equipment = m_package;

    }
}
