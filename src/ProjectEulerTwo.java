/**
 * Euler Two Fibonacci Even Sum Program.
 * Created by amytakayesu on 2/2/15.
 */
public class ProjectEulerTwo {
  /**
   * Calls the fibonacci sum method and specifies an upperBound and prints the sum.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    int sum = fibonacciEvenSum(4000000);
    System.out.println("Sum is " + sum);
  }

  /**
   * Computes sum of even fibonacci numbers up to upperBound.
   * @param upperBound the number to stop computing at
   * @return the sum of the even fibonacci numbers
   */
  public static int fibonacciEvenSum(int upperBound) {
    int first = 1;
    int second = 2;
    int sum = 0;

    while (second < upperBound) {
      if (second % 2 == 0) {
        sum += second;
      }
      System.out.printf("first is %6d. second is %6d. sum is %6d.%n", first, second, sum);
      second += first;
      first = second - first;
    }
    return sum;
  }
}
