package com.greenfoxacademy.exercises.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sith {
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String text;
  @JsonProperty("sith_text")
  private String sithText;

  public Sith() {
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getSithText() {
    return sithText;
  }

  public void setSithText(String sithText) {
    this.sithText = sithText;
  }

  public void reorderText() {
    List<String> wordsOfText = new ArrayList<>();
    for (String word : this.text.split(" ")) {
      wordsOfText.add(word);
    }
    for (int i = 0; i < wordsOfText.size(); i+=2) {
      Collections.swap(wordsOfText,i,i+1);
    }
    wordsOfText.add("Arrgh. Uhmm. Err..err.err.");
    this.sithText = wordsOfText.stream()
                                  .collect(Collectors.joining(" "));
  }
}
