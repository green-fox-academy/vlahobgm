package printable;

public class Todo implements Printable{
  protected String task;
  protected String priority;
  protected boolean done;

  public Todo(String task, String priority, boolean done) {
    this.task = task;
    this.priority = priority;
    this.done = done;
  }

  @Override
  public void printAllFields() {
    System.out.println("Task : " + task + " | Priority: " + priority + " | Done: " + done);
  }
}
