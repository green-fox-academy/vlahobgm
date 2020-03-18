package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpieList;

  public SharpieSet(){
    sharpieList = new ArrayList<>();
  }

  public int countUsable(){
    int count = 0;
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount > 0){
        count += 1;
      }
    }
    return count;
  }

  public void removeTrash(){
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount <= 0){
        sharpieList.remove(i);
      }

    }
  }
}
