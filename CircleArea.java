public class CircleArea {
  // Exercise 1.8 Compute the area and perimeter of a circle
  public static void main(String[] args) {
    double radius = 5.5;
    final double PI = 3.14159;
    System.out.println ("The area of a circle with radius " + radius + " is " + ( PI * radius * radius ));
    System.out.println ("The perimeter of a circle with radius " + radius + " is " + ( 2 * PI * radius ));
  }
}
    