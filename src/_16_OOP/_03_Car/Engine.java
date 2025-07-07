package _16_OOP._03_Car;

public class Engine {
    private String mark;
    private String cylinders;
    private String fuel;

    public Engine(String mark, String cylinders, String fuel) {
        this.mark = mark;
        this.cylinders = cylinders;
        this.fuel = fuel;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCylinders() {
        return cylinders;
    }

    public void setCylinders(String cylinders) {
        this.cylinders = cylinders;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return getMark() + ", Тип цилиндра: " + getCylinders() + ", Топливо: " + getFuel();
    }
}
