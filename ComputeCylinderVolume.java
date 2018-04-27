import java.util.Scanner;
public class ComputeCylinderVolume {
  // Exercise 2.2 Compute the area and volume of a cylinder
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println ("Enter the radius of the cylinder: ");
  double radius = input.nextDouble();
  System.out.println ("Enter the length of the cylinder: ");
  double length = input.nextDouble();
  final double PI = 3.14159;
  double area = radius * radius * PI;
  double volume = area * length;
  System.out.println ("The volume of the cylinder is " + volume);
  }
}