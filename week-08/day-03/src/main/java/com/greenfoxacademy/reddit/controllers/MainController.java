package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private PostService postService;
  private UserService userService;

  @Autowired
  public MainController(PostService postService, UserService userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("posts", postService.returnAllPostsDescByVotes());
    return "index";
  }

  @GetMapping("/submit")
  public String submitPost(Model model) {
    model.addAttribute("new_post", new Post());
    return "newpost";
  }

  @PostMapping("/submit")
  public String createPost(@ModelAttribute Post post) {
    postService.addPost(post);
    return "redirect:";
  }

  @GetMapping("/voting/{id}/{vote}")
  public String votingUp(@PathVariable("id") long id,@PathVariable("vote") String vote) {
    postService.changeVote(vote,id);
    return "redirect:/";
  }

  @GetMapping("/login")
  public String submitUser(Model model) {
    model.addAttribute("new_user", new User());
    return "login";
  }

  @PostMapping("/login")
  public String createUser(@ModelAttribute User user) {
    userService.addUser(user);
    return "redirect:";
  }

}
