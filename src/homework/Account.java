package homework;

public class Account {
    String name;
    int age;
    String sex;
    String address;
    double balance;

    public void printAge() {
        System.out.println(age);
    }

    public void setName(String name) {
        if (validateName(name))
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean validateName(String name) {
        if (name.contains("3"))
            return false;
        return true;
    }

    public void display() {
        System.out.println(sex);
        System.out.println(address);
        System.out.println("Имеет на счету $" + balance);
    }

    public void print(String name) {
        System.out.println(name);
    }
}