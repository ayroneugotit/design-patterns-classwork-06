package problem02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockExchange implements ISubject {
    private Map<String, Double> stockPrices = new HashMap<>();
    private Map<String, List<IObserver>> observers = new HashMap<>();

    public void setPrice(String stockSymbol, double price) {
        stockPrices.put(stockSymbol, price);
        notifyObservers(stockSymbol, price);
    }

    public double getPrice(String stockSymbol) {
        return stockPrices.getOrDefault(stockSymbol, 0.0);
    }

    @Override
    public void addObserver(String stockSymbol, IObserver observer) {
        observers.computeIfAbsent(stockSymbol, k -> new ArrayList<>()).add(observer);
    }

    @Override
    public void removeObserver(String stockSymbol, IObserver observer) {
        List<IObserver> list = observers.get(stockSymbol);
        if (list != null) list.remove(observer);
    }

    @Override
    public void notifyObservers(String stockSymbol, double price) {
        List<IObserver> list = observers.get(stockSymbol);
        if (list != null) {
            for (IObserver observer : list) {
                observer.update(stockSymbol, price);
            }
        }
    }
}