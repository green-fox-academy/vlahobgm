package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  private List<BankAccount> bankAccountList = new ArrayList<>();

  public MainController() {
    bankAccountList.add(new BankAccount("Simba", 2000, "lion",true));
    bankAccountList.add(new BankAccount("Timon", 15, "meerkat",false));
    bankAccountList.add(new BankAccount("Pumba", 56.4, "warthog",false));
    bankAccountList.add(new BankAccount("Nala", 1450, "lion",false));
    bankAccountList.add(new BankAccount("Mufasa", 9456, "lion",true));

  }

  @RequestMapping(value = "/show", method = RequestMethod.GET)
  public String showBankAccount(Model model) {
    model.addAttribute("bankAccounts", bankAccountList);
    return "index";
  }

  @RequestMapping(value = "/htmlception", method = RequestMethod.GET)
  public String htmlCeption() {
    return "htmlception";
  }

}
