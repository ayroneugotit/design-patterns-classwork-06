package problem01;

public class PlaneCostCalculationStrategy implements ICostCalculationStrategy {
    @Override
    public double calculate(TravelBookingContext travelBookingContext) {
        double startingCost = 50;
        double distanceCost = travelBookingContext.getDistance() * 50;
        double serviceTypeCost = 0;
        if (travelBookingContext.getServiceType() == ServiceType.Premium) {
            serviceTypeCost = distanceCost / 100 * 30;
        }
        double finalCost = startingCost + distanceCost + serviceTypeCost;
        return travelBookingContext.getDiscount().apply(finalCost);
    }
}
