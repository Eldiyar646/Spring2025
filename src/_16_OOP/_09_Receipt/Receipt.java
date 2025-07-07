package _16_OOP._09_Receipt;

public class Receipt {
    public int amount;

    public Receipt(int amount) {
        this.amount = amount;
    }

    public void print() {
        System.out.println("Receipt: " + amount + "som");
    }

}
