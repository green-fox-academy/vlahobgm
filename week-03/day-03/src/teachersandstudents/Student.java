package teachersandstudents;

public class Student {
  public void learn(){
    System.out.println("Learning...");
  }
  public void question(Teacher teacher){
    teacher.answer();
  }
}
