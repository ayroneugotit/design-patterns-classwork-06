package problem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose transport type");
        System.out.println("[1] - Plane");
        System.out.println("[2] - Train");
        System.out.println("[3] - Bus");
        int transportTypeUserPrompt = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter distance:");
        double distance = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Choose service type");
        System.out.println("[1] - Basic");
        System.out.println("[2] - Premium");
        int serviceTypeUserPrompt = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter code 'P20' for 20% discount, 'P15' for 15 discount");
        String discountUserPrompt = scanner.nextLine();

        ICostCalculationStrategy costCalculationStrategy = null;
        switch (transportTypeUserPrompt) {
            case 1:
                costCalculationStrategy = new PlaneCostCalculationStrategy();
                break;
            case 2:
                costCalculationStrategy = new TrainCostCalculationStrategy();
                break;
            case 3:
                costCalculationStrategy = new BusCostCalculationStrategy();
        }

        ServiceType serviceType = null;
        switch (serviceTypeUserPrompt) {
            case 1:
                serviceType = ServiceType.Basic;
                break;
            case 2:
                serviceType = ServiceType.Premium;
        }

        IDiscount discount = null;
        switch (discountUserPrompt) {
            case "P20":
                discount = new PercentDiscount(20);
                break;
            case "P15":
                discount = new StaticDiscount(15);
        }

        if (serviceType == null || discount == null) return;
        TravelBookingContext travelBookingContext = new TravelBookingContext(distance, serviceType, discount);

        if (costCalculationStrategy == null) return;
        System.out.println("Total cost: " + costCalculationStrategy.calculate(travelBookingContext));
    }
}
