package com.greenfoxacademy.todoh2.services;

import com.greenfoxacademy.todoh2.models.Todo;
import com.greenfoxacademy.todoh2.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> getTodos() {
    List<Todo> todoList = Arrays.asList(new Todo("boltba menni"), new Todo("kitakaritani"),
        new Todo("megcsinálni a feladatokat"));
    todoRepository.findAll()
        .forEach(todoList::add);
    return todoList;
  }
}
