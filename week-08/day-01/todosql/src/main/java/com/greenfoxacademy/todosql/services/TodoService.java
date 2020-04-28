package com.greenfoxacademy.todosql.services;

import com.greenfoxacademy.todosql.models.Todo;
import com.greenfoxacademy.todosql.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  TodoRepository todoRepository;
  private List<Todo> todoList;

  public TodoService() {
    todoList = new ArrayList<>();
  }

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void addTodo(Todo todo) {
    todoRepository.save(todo);
  }

  public Iterable<Todo> getTodos() {
    return todoRepository.findAll();
  }

  public List<Todo> isActive(Boolean isActive) {
    List<Todo> returnList = new ArrayList<>();
      todoRepository.findAll()
          .forEach(returnList::add);
      if (isActive){
        return returnList.stream()
            .filter(todo -> !todo.isDone())
            .collect(Collectors.toList());
      } else {
        return returnList.stream()
            .filter(todo -> todo.isDone())
            .collect(Collectors.toList());
      }

  }

  public void deleteTodo(Long id) {
    Optional<Todo> selectedTodo = todoRepository.findById(id);
    todoRepository.delete(selectedTodo.get());
  }
}
