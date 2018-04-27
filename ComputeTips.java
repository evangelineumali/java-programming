import java.util.Scanner;
public class ComputeTips {
  // Exercise 2.5 Compute tips given the subtotal and gratuity rate
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println ("Enter the subtotal: ");
    double subtotal = input.nextDouble();
    System.out.println ("Enter the gratuity rate: ");
    double gratuityRate = input.nextDouble();
    double tips = subtotal * gratuityRate / 100;
    double total = subtotal + tips;
    System.out.println ("The gratuity is $" + tips + " and the total is $" + total);
  }
}