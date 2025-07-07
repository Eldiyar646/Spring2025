package _16_OOP._09_Receipt;

public class Order {

    public int orderID;
    public Receipt receipt;

    public Order(int orderID, int amount) {
        this.orderID = orderID;
        this.receipt = new Receipt(amount);
    }

    public void printReceipt () {
        System.out.println("Order #" + orderID + ":");
        receipt.print();
    }

}