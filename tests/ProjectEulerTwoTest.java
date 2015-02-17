import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the Euler 2 class.
 *
 * @author amytakayesu
 */
public class ProjectEulerTwoTest {
  /**
   * Tests the sum of fibonacci method using two different upper bounds.
   *
   * @throws Exception in case of failure
   */
  @Test
  public void testSumFibonacci() throws Exception {
    assertEquals("UpperBound 10", 10, ProjectEulerTwo.sumFibonacci(10));
    assertEquals("UpperBound 50", 44, ProjectEulerTwo.sumFibonacci(50));
  }
}