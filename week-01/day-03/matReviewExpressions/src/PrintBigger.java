import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Give me a number: ");
        Scanner firstScanner = new Scanner(System.in);
        int firstNumber = firstScanner.nextInt();

        System.out.println("Give me another number: ");
        Scanner secondScanner = new Scanner(System.in);
        int secondNumber = firstScanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("This is the bigger: " + firstNumber);
        }
        else if (secondNumber > firstNumber) {
            System.out.println("This is the bigger: " + secondNumber);
        }else {
            System.out.println("Same numbers!");
        }
    }
}
