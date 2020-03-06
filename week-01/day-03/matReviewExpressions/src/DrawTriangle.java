import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Write a number: ");
        Scanner numberScanner = new Scanner(System.in);
        int inputNumber = numberScanner.nextInt();

        for (int i = 1; i <= inputNumber ; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
