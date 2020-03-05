import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Give me a Number: ");
        Scanner numberScanner = new Scanner(System.in);
        int inputNumber = numberScanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("Your number is Even!");
        }else {
            System.out.println("your number is Odd!");
        }
    }
}
