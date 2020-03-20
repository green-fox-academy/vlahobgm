package fibonacci;

import static org.junit.Assert.*;


import org.junit.Test;

public class FibonacciTest {

  @Test
  public void calcMemberFibonacci() {
    //Setup
    Fibonacci fibo = new Fibonacci();
    //Act
    int index = 6;
    int valueIndex = fibo.calcMemberFibonacci(index);
    //Assertion
    assertEquals(8,valueIndex);
  }

}