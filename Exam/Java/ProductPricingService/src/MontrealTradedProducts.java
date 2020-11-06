public interface MontrealTradedProducts {
    <Product> void addNewProduct(Product product);
    <Product> int Trade(Product product, int quantity);
    int totalTradeQuantityForDay();
    double totalValuesOfDaysTradedProducts();
}
