package problem01;

public class PercentDiscount implements IDiscount {
    private double discountPercent;

    public PercentDiscount(double percent) {
        discountPercent = percent;
    }

    @Override
    public double apply(double amount) {
        return amount - amount / 100 * discountPercent;
    }
}
