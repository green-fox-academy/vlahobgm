import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("Number of Girls: ");
        Scanner girlsScanner = new Scanner(System.in);
        int girlsNumber = girlsScanner.nextInt();

        System.out.println("Number of Boys: ");
        Scanner boysScanner = new Scanner(System.in);
        int boysNumber = girlsScanner.nextInt();

        if (girlsNumber == boysNumber && girlsNumber + boysNumber >= 20){
            System.out.println("The party is excellent!");
        }
        else if (girlsNumber + boysNumber >= 20 && boysNumber != girlsNumber && girlsNumber !=0) {
            System.out.println("Quite cool party!");
        }
        else if (boysNumber + girlsNumber < 20 && girlsNumber != 0) {
            System.out.println("Average party...");
        }
        else if (girlsNumber == 0) {
            System.out.println("Sausage party");
        }
    }
}
