import java.util.Scanner;

public class DrawPyramid {
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
    }
}
/*1 -> 1 space 5  i=1
2 -> 3   space 3  i=2
3 -> 5   space 2  i=3           input number : 5
4 -> 7   space 1  i=4
5 -> 9   space 0  i=5      */