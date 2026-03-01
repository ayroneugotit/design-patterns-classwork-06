package problem01;

public class TrainCostCalculationStrategy implements ICostCalculationStrategy {
    @Override
    public double calculate(TravelBookingContext travelBookingContext) {
        double startingCost = 35;
        double distanceCost = travelBookingContext.getDistance() * 25;
        double serviceTypeCost = 0;
        if (travelBookingContext.getServiceType() == ServiceType.Premium) {
            serviceTypeCost = distanceCost / 100 * 15;
        }
        double finalCost = startingCost + distanceCost + serviceTypeCost;
        return travelBookingContext.getDiscount().apply(finalCost);
    }
}
