package sharpieset;

public class Main {
  public static void main(String[] args) {
    Sharpie obj1 = new Sharpie("green",30.6f);
    Sharpie obj2 = new Sharpie("yellow",25.6f);
    Sharpie obj3 = new Sharpie("blue",14.2f);
    obj3.inkAmount = -10;

    SharpieSet list1 = new SharpieSet();
    list1.sharpieList.add(obj1);
    list1.sharpieList.add(obj2);
    list1.sharpieList.add(obj3);
    System.out.println(list1.countUsable());
    System.out.println(obj1.width);
    list1.removeTrash();
    int size = list1.sharpieList.size();
    System.out.println(size);


  }
}