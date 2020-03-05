import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("Please enter distance in mile: ");
        Scanner inputScanner = new Scanner(System.in);
        double mileDistance = inputScanner.nextDouble();
        double kmDistance = mileDistance * 1.609;
        System.out.println("Your distance in KM is : " + kmDistance + " KM");
    }
}
