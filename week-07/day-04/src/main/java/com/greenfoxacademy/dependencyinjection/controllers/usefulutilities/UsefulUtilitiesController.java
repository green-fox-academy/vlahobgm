package com.greenfoxacademy.dependencyinjection.controllers.usefulutilities;

import com.greenfoxacademy.dependencyinjection.services.usefulutilities.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsefulUtilitiesController {

  private UtilityService utilityService;

  @Autowired
  public UsefulUtilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String mainPage() {
    return "index";
  }

  @GetMapping("/useful/colored")
  public String coloredBackground(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String isValidEmail(Model model, @RequestParam String email) {
    model.addAttribute("valid", utilityService.validateEmail(email));
    model.addAttribute("givenEmail", email);
    return "index";
  }
}
