package problem01;

public class StaticDiscount implements IDiscount {
    private double discountAmount;

    public StaticDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double apply(double amount) {
        return amount - discountAmount;
    }
}
