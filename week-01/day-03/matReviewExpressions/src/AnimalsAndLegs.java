import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("How many chickens?: ");
        Scanner schickenScanner = new Scanner(System.in);
        int chickenNumber = schickenScanner.nextInt();
        System.out.println("How many pigs?: ");
        Scanner pigScanner = new Scanner(System.in);
        int pigNumber = pigScanner.nextInt();

        int legsNumber = (chickenNumber * 2) + (pigNumber * 4);
        System.out.println("Number of legs: " + legsNumber);
    }
}
