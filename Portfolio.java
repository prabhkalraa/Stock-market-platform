import java.util.*;

class Portfolio {
    ArrayList<Trade> trades = new ArrayList<>();
    double totalProfit = 0;

    void buyStock(Stock stock, int qty) {
        trades.add(new Trade(stock, qty, stock.price));
        System.out.println("Bought " + qty + " shares of " + stock.symbol);
    }

    void sellStock(String symbol, int qty) {
        for (Trade t : trades) {
            if (t.stock.symbol.equals(symbol)) {
                double pl = (t.stock.price - t.buyPrice) * qty;
                totalProfit += pl;
                t.quantity -= qty;
                System.out.println("Sold " + qty + " shares of " + symbol);
                return;
            }
        }
    }

    void displayPortfolio() {
        for (Trade t : trades) {
            System.out.println(t.stock.symbol + " | Qty: " + t.quantity);
        }
    }
}
