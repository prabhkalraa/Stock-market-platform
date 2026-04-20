class Stock {
    String symbol;
    double price;

    Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    void updatePrice() {
        double changePercent = (Math.random() * 4) - 2;
        price += price * (changePercent / 100);
        price = Math.round(price * 100.0) / 100.0;
    }
}
