package problem02;

public class Trader implements IObserver {
    private String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Трейдер " + name + ": акция " + stockSymbol + " теперь стоит " + price);
    }
}
