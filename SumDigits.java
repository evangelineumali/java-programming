import java.util.Scanner;
public class SumDigits {
  // Exercise 2.6 Sum the digits in an integer between 0 and 1000
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println ("Enter an integer between 0 and 1000: ");
    int integerNumber = input.nextInt();
    int thirdDigit = integerNumber % 10;
    int remainingDigit = integerNumber / 10;
    int secondDigit = remainingDigit % 10;
    remainingDigit = remainingDigit / 10;
    int sumResult = remainingDigit + secondDigit + thirdDigit;
    System.out.println ("The sum of the digits is " + sumResult);
  }
}