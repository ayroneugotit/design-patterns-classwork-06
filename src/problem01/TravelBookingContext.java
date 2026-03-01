package problem01;

public class TravelBookingContext {
    private double distance;
    private ServiceType serviceType;
    private IDiscount discount;

    public TravelBookingContext(double distance, ServiceType serviceType, IDiscount discount) {
        this.distance = distance;
        this.serviceType = serviceType;
        this.discount = discount;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public IDiscount getDiscount() {
        return discount;
    }

    public void setDiscount(IDiscount discount) {
        this.discount = discount;
    }
}
