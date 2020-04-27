package com.greenfoxacademy.todosql.controllers;

import com.greenfoxacademy.todosql.models.Todo;
import com.greenfoxacademy.todosql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @RequestMapping(path = {"", "/list"}, method = RequestMethod.GET)
  public String list(Model model){
    model.addAttribute("todos", todoService.getTodos());
    model.addAttribute("todo", new Todo());
    return "todolist";
  }

  @PostMapping("/register")
  public String addNewTodo(@ModelAttribute Todo todo, Model model) {
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }
}
