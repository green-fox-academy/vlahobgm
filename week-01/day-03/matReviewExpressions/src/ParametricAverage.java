import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        System.out.print("# of numbers to calculate: ");
        Scanner sc = new Scanner(System.in);
        int manyNumbers = sc.nextInt();
        int a = 1;
        int numbersAdd = 0;
        for (int i = 1; i <= manyNumbers; i++) {

            System.out.print(a + ". number:");
            numbersAdd += sc.nextInt();
            a++;
        }
        System.out.println("Sum: " + numbersAdd + " Average: " + (double)numbersAdd / manyNumbers);
    }
}
