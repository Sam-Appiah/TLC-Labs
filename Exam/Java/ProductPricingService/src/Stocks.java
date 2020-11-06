public class Stocks {
    private String ticker;
    private String exchange;

    public Stocks(String ticker, String exchange) {
        this.ticker = ticker;
        this.exchange = exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }


}
