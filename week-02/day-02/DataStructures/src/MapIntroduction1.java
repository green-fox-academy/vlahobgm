import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, Character> characters = new HashMap<>();
        //Print out whether the map is empty or not
        System.out.println(characters.isEmpty());
        //Add the following key-value pairs to the map
        characters.put(97, 'a');
        characters.put(98, 'b');
        characters.put(99, 'c');
        characters.put(65, 'A');
        characters.put(66, 'B');
        characters.put(67, 'C');
        //Print all the keys
        System.out.println(characters.keySet());
        for (Integer key:characters.keySet()){
            System.out.println(key);
        }
        //Print all the values
        System.out.println(characters.values());
        for (Character values : characters.values()){
            System.out.println(values);
        }
        //Add value D with the key 68
        characters.put(68, 'D');
        //Print how many key-value pairs are in the map
        System.out.println(characters.size());
        //Print the value that is associated with key 99
        System.out.println(characters.get(99));
        //Remove the key-value pair where with key 97
        characters.remove(97);
        //Print whether there is an associated value with key 100 or not
        System.out.println(characters.containsKey(100));
        //Remove all the key-value pairs
        characters.clear();
    }
}
