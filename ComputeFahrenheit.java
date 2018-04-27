import java.util.Scanner;
public class ComputeFahrenheit {
  // Exercise 2.1 Compute the degree in Fahrenheit, given a degree in Celsius
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println ("Enter the degree in Celsius: ");
  int Celsius = input.nextInt();
  double Fahrenheit = ( 9.0 / 5) * Celsius + 32;
  System.out.println ("The equivalent degree in Fahrenheit is " + Fahrenheit);
  }
}