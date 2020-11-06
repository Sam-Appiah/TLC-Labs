public class Pricing implements ProductPricingService{

    AddingProducts products = new AddingProducts();
    @Override
    public double price(String exchange, String ticker) {
        double productId = 1;
        double currentprice = 20;
        System.out.println("product id: " + productId);
        System.out.println("product price: " + currentprice);
        Object stockproduct = null;
        products.Trade(stockproduct, 50);
        products.totalTradeQuantityForDay();
        return 0;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        double productId = 2;
        double currentprice = 40;
        System.out.println("product id: " + productId);
        System.out.println("product price: " + currentprice);
        Object stockproduct = null;
        products.Trade(stockproduct, 50);
        products.totalTradeQuantityForDay();
        return 0;
    }
}
