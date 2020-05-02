package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Trick;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TrickService {

  private List<Trick> trickList;

  public TrickService() {
    trickList = new ArrayList<>();
  }
}
