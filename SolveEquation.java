public class SolveEquation {
  // Exercise 1.13 Solve 2 X 2 linear equations using Cramer's rule
  public static void main(String[] args) {
    double a = 3.4;
    double b = 50.2;
    double c = 2.1;
    double d = .55;
    double e = 44.5;
    double f = 5.9;
    double x = (( e * d ) - ( b * f )) / (( a * d ) - ( b * c ));
    double y = (( a * f ) - ( e * c )) / (( a * d ) - ( b * c ));
    System.out.println ("Given " + a + "x + " + b + "y = " + e + " and " + c + "x + " + c + "y = " + f + ", then ");
    System.out.println ("the value of x is " + x + " and the value of y is " + y );
  }
}