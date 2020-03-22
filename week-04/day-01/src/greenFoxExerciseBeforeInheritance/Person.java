package greenFoxExerciseBeforeInheritance;

public class Person {
  String name;
  int age;
  String gender;

  public void introduce(){
    System.out.println("Hi, I'm " + this.name + ",a " + this.age + " year old " + this.gender);
  }

  public void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }

  public Person(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }
}
