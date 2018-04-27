public class ProjectPopulation {
  // Exercise 1.11 Compute the population projection
  public static void main(String[] args) {
    int currentPopulation = 312032486;
    int numberOfDays = 365;
    int birthRate = 7;
    int deathRate = 13;
    int immigrationRate = 45;
    int yearProjection = 5;
    double increaseInOneYear = numberOfDays * 24 * 60 * 60 * ( 1.0 / birthRate - 1.0 / deathRate + 1.0 / immigrationRate);
    int increment = (int) increaseInOneYear;    /* convert into a whole number */
    System.out.println ("The rate of increase per year is " + increment);
    System.out.println ("The population on the first year is " + (currentPopulation + increment));
    System.out.println ("The population on the second year is " + (currentPopulation + (increment * 2)));
    System.out.println ("The population on the third year is " + (currentPopulation + (increment * 3)));
    System.out.println ("The population on the fourth year is " + (currentPopulation + (increment * 4)));
    System.out.println ("The population on the fifth year is " + (currentPopulation + (increment *5)));
  }
}