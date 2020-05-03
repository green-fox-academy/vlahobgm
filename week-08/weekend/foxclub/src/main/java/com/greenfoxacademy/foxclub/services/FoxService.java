package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;

@Service
public interface FoxService {
  Fox getFoxByName(String name);
}
