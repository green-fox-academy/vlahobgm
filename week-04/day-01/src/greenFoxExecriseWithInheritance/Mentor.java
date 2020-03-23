package greenFoxExecriseWithInheritance;

public class Mentor extends Person{
  private String level;

  public void getGoal(){
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public void introduce(){
    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old "+ this.gender +
        " " + this.level + " mentor.");
  }

  public Mentor(String name, int age, String gender, String level){
    super(name, age, gender);
    this.level = level;
  }

  public Mentor(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.level = "intermediate";
  }
}
