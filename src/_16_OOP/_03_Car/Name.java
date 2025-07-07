package _16_OOP._03_Car;

public class Name {

    private String nameCar;

    public Name(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public String toString() {
        return nameCar;
    }
}