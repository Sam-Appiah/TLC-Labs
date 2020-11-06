import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MontrealTradedProductsTest {

    @Test
    public void addNewProduct() {
        try {
            Stocks stocks = new Stocks("ght", "pkh");
            throw new Exception();
        }
        catch(Exception e){
            System.out.println("Product is registered twice");
        }
    }

    @Test
    public int trade() {
        int quantity = 0;
        ArrayList registered = new ArrayList();
        registered.add("people");
        registered.add("food");
        for(Object q:registered) {
            quantity += 1;
        }
        assertEquals(2, quantity);
        return 0;
    }

    @Test
    public void totalTradeQuantityForDay() {
    }

    @Test
    public void totalValuesOfDaysTradedProducts() {
    }
}