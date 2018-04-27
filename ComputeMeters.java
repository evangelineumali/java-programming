import java.util.Scanner;
public class ComputeMeters {
  // Exercise 2.3 Compute meters, given a number in feet
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println ("Enter a number in feet: ");
  double feet = input.nextDouble();
  double meters = feet * 0.305;
  System.out.println ("The number in meters is " + meters);
  }
}