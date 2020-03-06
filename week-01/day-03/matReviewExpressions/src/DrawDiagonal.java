import java.util.Scanner;

public class DrawDiagonal {
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
                System.out.println("%" + " ".repeat(i-2) + "%" + " ".repeat(inputNumber - i-1) + "%");
            }
        }
    }
}
