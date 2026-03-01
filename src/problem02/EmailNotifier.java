package problem02;

class EmailNotifier implements IObserver {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Email уведомление: акция " + stockSymbol + " изменила цену на " + price);
    }
}
