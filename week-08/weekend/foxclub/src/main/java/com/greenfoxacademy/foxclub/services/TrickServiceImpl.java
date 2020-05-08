package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;
import com.greenfoxacademy.foxclub.repositories.FoxRepository;
import com.greenfoxacademy.foxclub.repositories.TrickRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TrickServiceImpl implements TrickService{
  private TrickRepository trickRepository;
  private FoxRepository foxRepository;

  public TrickServiceImpl(TrickRepository trickRepository, FoxRepository foxRepository) {
    this.trickRepository = trickRepository;
    this.foxRepository = foxRepository;
  }

  @Override
  public List<Trick> returnAllTricks() {
    List<Trick> tricks = new ArrayList<>();
    trickRepository.findAll()
        .forEach(tricks::add);
    return tricks;
  }

  @Override
  public void addTrickToFox(String selectedTrick, String name) {
    Fox fox = foxRepository.getFoxByName(name);
    Trick trick = new Trick();
    trick.setName(selectedTrick);
    trick.setFox(fox);
    List<Trick> foxTricks = fox.getTricks();
    foxTricks.add(trick);
    fox.setTricks(foxTricks);
    foxRepository.save(fox);
    trickRepository.save(trick);
  }
}
