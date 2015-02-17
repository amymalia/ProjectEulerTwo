/**
 * Project Euler 2.
 * Created by amytakayesu on 2/2/15.
 */
public class ProjectEulerTwo {
  /**
   * Calls sumFibonacci to obtain the sum of fibonacci numbers up to an upperbound and prints it.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    int sum = sumFibonacci(4000000);
    System.out.println("Sum is " + sum);
  }

  /**
   * Computes the sum of fibonacci numbers up to an upperbound.
   *
   * @param upperBound the number to stop computing at
   * @return the sum of the numbers
   */
  public static int sumFibonacci(int upperBound) {
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
