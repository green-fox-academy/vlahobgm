package teachersandstudents;

public class Teacher {
  public void answer(){
    System.out.println("Answering...");
  }

  public void teach(Student student){
    student.learn();
  }
}
