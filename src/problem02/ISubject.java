package problem02;

public interface ISubject {
    void addObserver(String stockSymbol, IObserver observer);
    void removeObserver(String stockSymbol, IObserver observer);
    void notifyObservers(String stockSymbol, double price);
}
