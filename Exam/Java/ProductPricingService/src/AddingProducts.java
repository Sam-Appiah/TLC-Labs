import java.util.ArrayList;

public class AddingProducts implements MontrealTradedProducts{
    ArrayList registered = new ArrayList();
    int quantity;

    @Override
    public <Product> void addNewProduct(Product product) {
        //ArrayList registered = new ArrayList();
        Stocks stockprdoduct = new Stocks("frm", "pol");
        Futures futureproduct = new Futures("kol", "dfg",25,2020);
        registered.add(stockprdoduct);
        registered.add(futureproduct);

    }
    @Override
    public <Product> int Trade(Product product, int quantity) {
        for(Object q:registered) {
        }
        return quantity+=1;
    }

    @Override
    public int totalTradeQuantityForDay() {
        int currentprice = 0;
        int idstock = 1;
        for(Object q:registered) {
            if(q.equals(idstock))
                currentprice = 20;
            else
                currentprice = 40;
        }
        int tradeQuantity = currentprice * quantity;
        return tradeQuantity;
    }

    @Override
    public double totalValuesOfDaysTradedProducts() {
        return 0;
    }
}
