public class ApproximatePi {
  // Exercise 1.7 Compute the value of PI approximately
  public static void main(String[] args) {
    double result1 = 1.0;
    result1 = 1.0 - ( 1.0 / 3 ) + ( 1.0 / 5 ) - ( 1.0 / 7 ) + ( 1.0 / 9 ) - ( 1.0 / 11 );
    double result2 = 1.0;
    result2 = result1 + ( 1.0 / 13 );
    System.out.println ("The value of Pi is approximately " + (4 * result1) + " or " + ( 4 * result2));
  }
}