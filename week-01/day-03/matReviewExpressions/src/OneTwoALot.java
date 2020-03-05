import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        System.out.println("Give me a Number: ");
        Scanner numberScanner = new Scanner(System.in);
        int inputNumber = numberScanner.nextInt();

        if (inputNumber <= 0) {
            System.out.println("Not enough!");
        }
        else if (inputNumber == 1) {
            System.out.println("One");
        }
        else if (inputNumber == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }
    }
}
