package farm;

public class Main {
  public static void main(String[] args) {
    Animal dog = new Animal();
    Animal cat = new Animal();
    dog.play();
    dog.drink();
    cat.eat();

    System.out.println();
    Farm farm1 = new Farm();
    farm1.farm.add(dog);
    farm1.farm.add(cat);
    farm1.breed();
    System.out.println(farm1.farm.size());
  }
}