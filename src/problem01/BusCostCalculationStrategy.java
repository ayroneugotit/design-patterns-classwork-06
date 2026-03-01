package problem01;

public class BusCostCalculationStrategy implements ICostCalculationStrategy {
    @Override
    public double calculate(TravelBookingContext travelBookingContext) {
        double startingCost = 20;
        double distanceCost = travelBookingContext.getDistance() * 10;
        double finalCost = startingCost + distanceCost;
        return travelBookingContext.getDiscount().apply(finalCost);
    }
}
