import java.util.Scanner;

public class MunicipalWasteCollection {

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

    public static void main(String[] args) {
        checkCollectionStatus();
    }
}