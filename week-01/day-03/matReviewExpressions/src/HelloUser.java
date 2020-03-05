import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner nameScanner = new Scanner(System.in);
        String nameInput = nameScanner.nextLine();
        System.out.println("Hello, " + nameInput + " !");

    }
}
