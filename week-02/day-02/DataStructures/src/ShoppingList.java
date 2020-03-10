import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        //Do we have milk on the list?
        boolean haveMilk = shoppingList.contains("milk");
        System.out.println("Do we have milk on the list? " + haveMilk);
        //Do we have bananas on the list?
        boolean haveBananas = shoppingList.contains("bananas");
        System.out.println("Do we have bananas on the list? " + haveBananas);
    }
}
