package com.greenfoxacademy.finder.controller;

import com.greenfoxacademy.finder.service.UserService;
import com.greenfoxacademy.finder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping("/app")
public class AppController {

    UserService service;

    @Autowired
    public AppController(UserService service) {
        this.service = service;
    }

    @GetMapping(value = "")
    public String index(Model model) {
        model.addAttribute("users", service.getAll());
        model.addAttribute("new_user", new User());
        return "main";
    }

    @PostMapping(value = "/add")
    public String create(@ModelAttribute User user) {
        service.addUser(user);
        return "redirect:/app";
    }
}