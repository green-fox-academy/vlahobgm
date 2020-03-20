package countLetters;

import java.util.HashMap;

public class CountLetters {

  public HashMap<Character,Integer> letterCounter(String word){
    HashMap<Character,Integer> map = new HashMap<>();

    char [] wordArray = word.toCharArray();

    for (char c : wordArray) {
      if (map.containsKey(c)){
        map.put(c,map.get(c)+1);
      }else {
        map.put(c,1);
      }
    }
    return map;
  }
}

  /*Write a function, that takes a string as an argument and returns a dictionary with all letters
    in the string as keys, and numbers as values that shows how many occurrences there are.
    Create a test for that.*/