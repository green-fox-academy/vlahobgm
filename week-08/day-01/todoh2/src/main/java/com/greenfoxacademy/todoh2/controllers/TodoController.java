package com.greenfoxacademy.todoh2.controllers;

import com.greenfoxacademy.todoh2.repositories.TodoRepository;
import com.greenfoxacademy.todoh2.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @RequestMapping(value = {"", "/list"}, method = RequestMethod.GET)
  public String list(Model model){
    model.addAttribute("todos", todoService.getTodos());
    return "todolist";
  }
}
