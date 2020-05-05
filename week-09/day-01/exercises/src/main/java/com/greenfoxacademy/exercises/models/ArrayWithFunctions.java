package com.greenfoxacademy.exercises.models;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayWithFunctions {
  private String what;
  private Integer result;
  private List<Integer> numbers;
  private List<Integer> results;

  public ArrayWithFunctions(String what, List<Integer> numbers) {
    this.what = what;
    this.numbers = numbers;
    if (this.what.equals("sum")) {
      this.result = getSumOFNumbers();
    } else if (this.what.equals("multiply")) {
      this.result = getMultiplyOfNumbers();
    }
    if (this.what.equals("double")) {
      this.results = getDoubleOfNumbers();
    }
  }

  public Integer getSumOFNumbers() {
    return numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
  }

  public Integer getMultiplyOfNumbers() {
    return numbers.stream()
                    .reduce(1,(a,b) -> a*b);
  }

  public List<Integer> getDoubleOfNumbers() {
    return numbers.stream()
                    .map(i -> i*2)
                    .collect(Collectors.toList());
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public List<Integer> getResults() {
    return results;
  }

  public void setResults(List<Integer> results) {
    this.results = results;
  }
}
