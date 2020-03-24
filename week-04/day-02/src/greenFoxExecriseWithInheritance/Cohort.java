package greenFoxExecriseWithInheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String name;
  private List<Student> students = new ArrayList<>();
  private List<Mentor> mentors = new ArrayList<>();

  public void addStudent(Student student){
    this.students.add(student);
  }

  public void addMentor(Mentor mentor){
    this.mentors.add(mentor);
  }

  public void info(){
    System.out.println("The " + this.name + " cohort has " + this.students.size() + " students " +
        "and " + this.mentors.size() + " mentors.");
  }

  public Cohort(String name){
    this.name = name;
    this.students.isEmpty();
    this.mentors.isEmpty();
  }
}
