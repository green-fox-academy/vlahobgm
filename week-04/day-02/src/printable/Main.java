package printable;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Domino domino1 = new Domino(3,2);
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(domino1);
    for (Domino d : dominoes) {
      d.printAllFields();
    }

    Todo todo1 = new Todo("Buy milk", "high", true);
    List<Todo> todos = new ArrayList<>();
    todos.add(todo1);
    for (Todo t : todos) {
      t.printAllFields();
    }
  }
}
