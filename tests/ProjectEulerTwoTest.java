import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the Euler Two Fibonacci Even Sum class.
 *
 * @author amytakayesu
 */
public class ProjectEulerTwoTest {
  /**
   * Tests the testFibonacciEvenSum method with two upperBounds.
   *
   * @throws Exception in case of failure.
   */
  @Test
  public void testFibonacciEvenSum() throws Exception {
    assertEquals("upperBound 10.", 10, ProjectEulerTwo.fibonacciEvenSum(10));
    assertEquals("upperBound 50.", 44, ProjectEulerTwo.fibonacciEvenSum(50));
  }
}