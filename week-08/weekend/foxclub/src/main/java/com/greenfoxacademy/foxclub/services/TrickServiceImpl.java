package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.repositories.TrickRepository;
import org.springframework.stereotype.Service;

@Service
public class TrickServiceImpl implements TrickService{
  private TrickRepository trickRepository;

  public TrickServiceImpl(TrickRepository trickRepository) {
    this.trickRepository = trickRepository;
  }
}
