class Trade {
    Stock stock;
    int quantity;
    double buyPrice;

    Trade(Stock stock, int quantity, double buyPrice) {
        this.stock = stock;
        this.quantity = quantity;
        this.buyPrice = buyPrice;
    }

    double currentValue() {
        return quantity * stock.price;
    }

    double profitLoss() {
        return (stock.price - buyPrice) * quantity;
    }
}
