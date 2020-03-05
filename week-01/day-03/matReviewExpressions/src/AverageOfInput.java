import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        System.out.println("Give me your First number: ");
        Scanner firstScanner = new Scanner(System.in);
        int firstNumber = firstScanner.nextInt();

        System.out.println("Give me your Second number: ");
        Scanner secondScanner = new Scanner(System.in);
        int secondNumber = secondScanner.nextInt();

        System.out.println("Give me your Third number: ");
        Scanner thirdScanner = new Scanner(System.in);
        int thirdNumber = secondScanner.nextInt();

        System.out.println("Give me your Fourth number: ");
        Scanner fourthScanner = new Scanner(System.in);
        int fourthNumber = secondScanner.nextInt();

        System.out.println("Give me your Fifth number: ");
        Scanner fifthScanner = new Scanner(System.in);
        int fifthNumber = secondScanner.nextInt();

        int sumNumber = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        double averageNumber = (double)(firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber) / 5;

        System.out.println("Sum: " + sumNumber + ", Average: " + averageNumber);
    }
}
