package abstraction.shop;

public interface Purchasable {
    String DEFAULT_CURRENCY = "KGS";

    void purchase(String productName, double price);

    default void purchaseDefault() {
        purchase("Lexus", 5000000);
        log("Оплатите стоимость товара в " + DEFAULT_CURRENCY + " ");
    }

    static void showTerms() {
        System.out.println("Сервисная гарантия 3 месяца");
    }

    private void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
