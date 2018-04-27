public class SpeedInMiles {
  // Exercise 1.10 Compute average speed in miles per hour given a distance in kilometers
  public static void main(String[] args) {
    int distance = 14;
    int minutes = 45;
    int seconds = 30;
    double conversion = 1.6;
    System.out.println ("Given a distance of " + distance + " kilometers" + " and a time of " + minutes + " minutes and " + seconds + " seconds, the average speed in miles per hour is " + ( distance / conversion ) / ( ( minutes + ( seconds / 60.0 ) ) / 60.0 ));
  }
}