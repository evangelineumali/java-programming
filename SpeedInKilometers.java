public class SpeedInKilometers {
  // Exercise 1.12 Compute average speed in kilometers per hour given a distance in miles
  public static void main(String[] args) {
    int distance = 24;
    int hours = 1;
    int minutes = 40;
    int seconds = 35;
    double conversion = 1.6;
    System.out.println ("Given a distance of " + distance + " miles and a time of " + hours + " hour, " + minutes + " minutes and " + seconds + " seconds, the average speed in kilometers per hour is " + ( distance * conversion ) / ( hours + ( minutes + ( seconds / 60.0 ) ) / 60.0 ));
  }
}