import java.util.Scanner;
public class ComputeKilograms {
  // Exercise 2.4 Compute kilograms, given a number in pounds
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println ("Enter a number in pounds: ");
    double pounds = input.nextDouble();
    double kilograms = pounds * 0.454;
    System.out.println ("The number in kilograms is " + kilograms);
  }
}