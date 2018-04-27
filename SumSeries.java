public class SumSeries {
  // Compute the sum of the series from 1 to 9
  public static void main(String[] args) {
    int sum = 0;
    for ( int x = 1; x < 10; x++ ) {
      sum = sum + x;
    }
    System.out.println ("The sum of the series from 1 to 9 is " + sum );
  }
}