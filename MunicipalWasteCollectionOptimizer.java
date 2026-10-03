
public class MunicipalWasteCollectionOptimizer {

    // 3a) Data Types
    public static void displayVehicleDetails() {
        int vehicleNumber = 101;
        double wasteCollected = 85.5;
        int collectionPoints = 5;
        char vehicleStatus = 'Z';

        System.out.println("=== Vehicle Details ===");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println();
    }

    public static void main(String[] args) {
        displayVehicleDetails();
    }
}