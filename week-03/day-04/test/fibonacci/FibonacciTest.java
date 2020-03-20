package fibonacci;

import static org.junit.Assert.*;


import org.junit.Test;

public class FibonacciTest {

  @Test
  public void calcMemberFibonacci() {
    Fibonacci fibo = new Fibonacci();
    int index = 6;
    assertEquals(8,fibo.calcMemberFibonacci(index));
  }

}