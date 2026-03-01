package problem02;

public class Main {
    public static void main(String[] args) {
        StockExchange exchange = new StockExchange();

        Trader traderAlice = new Trader("Max");
        Trader traderBob = new Trader("Didarbek");
        TradingRobot robot = new TradingRobot(50.0, 150.0);
        EmailNotifier emailNotifier = new EmailNotifier();

        exchange.addObserver("AAPL", traderAlice);
        exchange.addObserver("AAPL", robot);
        exchange.addObserver("AAPL", emailNotifier);

        exchange.addObserver("GOOG", traderBob);
        exchange.addObserver("GOOG", robot);

        exchange.setPrice("AAPL", 145.0);
        exchange.setPrice("GOOG", 48.0);
        exchange.setPrice("AAPL", 151.0);

        exchange.removeObserver("AAPL", emailNotifier);

        exchange.setPrice("AAPL", 140.0);
        exchange.setPrice("GOOG", 155.0);
    }
}
