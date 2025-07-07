package abstraction.shop;

public class Shop_Main {
    public static void main(String[] args) {

        Purchasable card = new CardPayment();
        Purchasable cash = new WalletPayment();

        card.purchase("Ноутбук", 50000);
        Purchasable.showTerms();
        System.out.println("----------------------------");
        cash.purchase("Планшет", 35000);
        Purchasable.showTerms();
        System.out.println("----------------------------");


        cash.purchaseDefault();

    }
}
