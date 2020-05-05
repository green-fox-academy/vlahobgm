package com.greenfoxacademy.exercises.services;

import com.greenfoxacademy.exercises.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService{
  private LogRepository logRepository;

  @Autowired
  public LogServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }
}
