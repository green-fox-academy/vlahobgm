import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Give me the first numbers: ");
        Scanner firstScanner = new Scanner(System.in);
        int firstNumber = firstScanner.nextInt();

        System.out.println("Give me the second numbers: ");
        Scanner secondScanner = new Scanner(System.in);
        int secondNumber = firstScanner.nextInt();

        if (secondNumber <= firstNumber) {
            System.out.println("The second number should be bigger");
        }
        else {
            while (firstNumber < secondNumber) {
                System.out.println(firstNumber);
                firstNumber+=1;
            }
        }
    }
}
