package apples;

import static org.junit.Assert.*;

public class AppleTest {

  @org.junit.Test
  public void getApple() {
    Apple apple = new Apple();
    assertEquals("apple",apple.getApple());
  }
}