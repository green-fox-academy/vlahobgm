import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int storedNumber = 8;
        System.out.print("Guess my number: ");
        Scanner inputScanner = new Scanner(System.in);
        int inputNumber1 = inputScanner.nextInt();

        while (inputNumber1 != storedNumber) {

            if (inputNumber1 < storedNumber) {
                System.out.print("The stored number is higher... Guess another: ");
                inputNumber1 = inputScanner.nextInt();
            } else if (inputNumber1 > storedNumber) {
                System.out.print("The stored number is lower... Guess another: ");
                inputNumber1 = inputScanner.nextInt();
            }

        }
        if (inputNumber1 == storedNumber){
            System.out.print("You found the number: " + storedNumber);
        }
    }
}
