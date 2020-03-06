import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        System.out.println("Write a Number: ");
        Scanner inputScanner = new Scanner(System.in);
        int inputNumber = inputScanner.nextInt();

        for (int i = 1; i <= inputNumber; i++) {
            String space = " ";
            System.out.print(space.repeat(inputNumber - i));
            for (int j = 1; j <= 2*i-1 ; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = inputNumber - 1; i >= inputNumber - inputNumber +1; i--) {
            String space = " ";
            System.out.print(space.repeat(inputNumber - i));
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
