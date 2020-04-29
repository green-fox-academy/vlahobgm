package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
  void addUser(User user);
}
