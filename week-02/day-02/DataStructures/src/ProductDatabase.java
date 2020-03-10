import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Eggs", 200);
        priceMap.put("Milk", 200);
        priceMap.put("Fish", 400);
        priceMap.put("Apples", 150);
        priceMap.put("Bread", 50);
        priceMap.put("Chicken", 550);

        //How much is the fish?
        System.out.println("How much is the fish? " + priceMap.get("Fish"));

        //What is the most expensive product?
        int max = Collections.max(priceMap.values());
        System.out.println("What is the most expensive product? " + max);
        
        //What is the average price?
        int sum = 0;
        for (Integer values : priceMap.values()) {
            sum += values;
        }
        double average = (double)sum/priceMap.size();
        System.out.println("What is the average price? " + average);
        
        //How many products' price is below 300?
        int counter = 0;
        for (Map.Entry<String, Integer> item : priceMap.entrySet()) {
            if (item.getValue() < 300) {
                counter++;
            }
        }
        System.out.println("How many products' price is below 300? " + counter);


        //Is there anything we can buy for exactly 125?
        System.out.print("Is there anything we can buy for exactly 125? ");
        for (Map.Entry<String, Integer> item : priceMap.entrySet()) {
            if (item.getValue() == 125) {
                System.out.println(item.getKey());
            }
        }

        //What is the cheapest product?
        int min = Collections.min(priceMap.values());
        System.out.println("\nWhat is the cheapest product? " + min);
    }
}
