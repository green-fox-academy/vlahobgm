package zoo;

abstract public class Animal {
  protected String name;
  protected int age;

  public Animal(String name) {
    this.name = name;
  }


  public String getName() {
    return name;
  }

  abstract public String breed();
}
