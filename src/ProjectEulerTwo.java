/**
 * Created by amytakayesu on 2/2/15.
 */
public class ProjectEulerTwo {
  public static void main(String[] args) {
    int first = 1;
    int second = 2;
    int sum = 0;

    while(second < 4000000){
      if(second % 2 == 0){
        sum += second;
      }
      System.out.printf("first is %6d. second is %6d. sum is %6d.%n", first, second, sum);
      second += first;
      first = second - first;
    }
    System.out.println("Sum is " + sum);
  }
}
