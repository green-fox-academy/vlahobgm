package com.greenfoxacademy.todosql.controllers;

import com.greenfoxacademy.todosql.models.Todo;
import com.greenfoxacademy.todosql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @RequestMapping(path = {"", "/list"}, method = RequestMethod.GET)
  public String list(Model model, @RequestParam(required = false) Boolean isActive){
    if (isActive == null) {
      model.addAttribute("todos", todoService.getTodos());
    }else {
      model.addAttribute("todos", todoService.isActive(isActive));
    }
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String addNewTodo(Model model) {
    model.addAttribute("newTodo",new Todo());
    return "addtodo";
  }

  @PostMapping(value = "/add")
  public String getAddNewTodo(@ModelAttribute Todo todo, Model model) {
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }


}
