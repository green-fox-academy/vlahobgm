import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Give me a number: ");
        Scanner numberScanner = new Scanner(System.in);
        int inputNumber = numberScanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + inputNumber + " = " + i * inputNumber);
        }
    }
}
