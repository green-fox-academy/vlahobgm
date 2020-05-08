package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TrickService {
  List<Trick> returnAllTricks();
  void addTrickToFox(Trick trick, String name);
}
