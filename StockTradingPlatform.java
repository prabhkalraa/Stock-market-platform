import java.util.*;

public class StockTradingPlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Portfolio myPortfolio = new Portfolio();

        Stock apple = new Stock("AAPL", 150);
        HashMap<String, Stock> market = new HashMap<>();
        market.put("AAPL", apple);

        System.out.println("Welcome!");

        while (true) {
            System.out.println("1. Buy\n2. Exit");
            int ch = scanner.nextInt();

            if (ch == 1) {
                myPortfolio.buyStock(apple, 1);
            } else {
                break;
            }
        }
    }
}
