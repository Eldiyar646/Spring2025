package abstraction.shop;

public class WalletPayment implements Purchasable{
    @Override
    public void purchase(String productName, double price) {
            System.out.println("Оплата наличкой : " + productName + " стоит " + price + " " + DEFAULT_CURRENCY);
    }
}
