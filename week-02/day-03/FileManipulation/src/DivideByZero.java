import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
        try {
            divideTwoNum();
        }catch (ArithmeticException e){
            System.out.println("fail");
        }
    }

    public static void divideTwoNum(){
        int numberToDivide = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Divide 10 with: ");
        int dividor = sc.nextInt();
        System.out.println("Result is: " + numberToDivide/dividor);
    }
}
