package problem02;

class TradingRobot implements IObserver {
    private double buyThreshold;
    private double sellThreshold;

    public TradingRobot(double buyThreshold, double sellThreshold) {
        this.buyThreshold = buyThreshold;
        this.sellThreshold = sellThreshold;
    }

    @Override
    public void update(String stockSymbol, double price) {
        if (price <= buyThreshold) {
            System.out.println("Робот покупает " + stockSymbol + " по цене " + price);
        } else if (price >= sellThreshold) {
            System.out.println("Робот продает " + stockSymbol + " по цене " + price);
        } else {
            System.out.println("Робот наблюдает за " + stockSymbol + ", текущая цена: " + price);
        }
    }
}
