import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Eggs", 200);
        priceMap.put("Milk", 200);
        priceMap.put("Fish", 400);
        priceMap.put("Apples", 150);
        priceMap.put("Bread", 50);
        priceMap.put("Chicken", 550);

        //Which products cost less than 201? (just the name)
        for (Map.Entry<String, Integer> item : priceMap.entrySet()) {
            if (item.getValue() < 201) {
                System.out.println(item.getKey());
            }
        }
        //Which products cost more than 150? (name + price)
        for (Map.Entry<String, Integer> item : priceMap.entrySet()) {
            if (item.getValue() > 150) {
                System.out.println(item.getKey() + " " + item.getValue());
            }
        }
    }
}
