package abstraction.shop;

public class CardPayment implements Purchasable{

    @Override
    public void purchase(String productName, double price) {
        System.out.println("Оплата по карте: " + productName + " стоит " + price + " " + DEFAULT_CURRENCY);
    }
}
