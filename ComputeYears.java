import java.util.Scanner;
public class ComputeYears {
  // Exercise 2.7 Compute number of years and days, given the minutes
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println ("Enter the number of minutes: ");
    int minutes = input.nextInt();
    int hours = minutes / 60;
    int days = hours / 24;
    int remainingDays = days % 365;
    int years = days / 365;
    System.out.println ("There are approximately " + years + " years and " + remainingDays + " days");
  }
}