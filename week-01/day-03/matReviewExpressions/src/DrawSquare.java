import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        System.out.println("Write a number: ");
        Scanner inputScanner = new Scanner(System.in);
        int inputNumber = inputScanner.nextInt();

        for (int i = 1; i <= inputNumber ; i++) {
            if (i==1 || i == inputNumber){
                for (int j = 1; j <= inputNumber; j++) {
                    System.out.print("%");
                }
                System.out.println();
            }
            else {
                System.out.print("%" + " ".repeat(inputNumber - 2) + "%");
                System.out.println();
            }
        }
    }
}
