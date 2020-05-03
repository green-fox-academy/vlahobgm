package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "foxes")
public class Fox {

  @Id
  @GeneratedValue
  private long id;
  private String name;
  private String food;
  private String drink;

  @OneToMany(fetch = FetchType.EAGER)
  private List<Trick> trick;

  public Fox() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Trick> getTrick() {
    return trick;
  }

  public void setTrick(List<Trick> trick) {
    this.trick = trick;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
