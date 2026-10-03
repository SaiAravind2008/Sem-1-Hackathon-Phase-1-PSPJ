 import java.util.Scanner;

public class MunicipalWasteCollectiontwocollection {

    // Part 3a
    public static void displayVehicleDetails() {
        int vehicleNumber = 101;
        double wasteCollected = 85.5;
        int collectionPoints = 5;
        char vehicleStatus = 'A';

        System.out.println("=== Vehicle Details ===");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println();
    }

    // Part 3b
    public static void checkCollectionStatus() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste collected in kilograms: ");
        double wasteCollected = sc.nextDouble();

        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        System.out.println();
    }

    // Part 3c
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void calculateWasteFromPoints() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste collected at Point 1 (kg): ");
        double point1 = sc.nextDouble();

        System.out.print("Enter waste collected at Point 2 (kg): ");
        double point2 = sc.nextDouble();

        double total = calculateTotalWaste(point1, point2);

        System.out.println("Total Waste Collected: " + total + " kg");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        displayVehicleDetails();
        checkCollectionStatus();
        calculateWasteFromPoints();
    }
}