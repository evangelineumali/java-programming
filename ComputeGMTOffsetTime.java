import java.util.Scanner;
public class ComputeGMTOffsetTime {
  // Compute current time, with offset to GMT, using System.currentTimeMillis
  public static void main(String[] args) {
    System.out.println ("Enter the time zone offset to GMT: ");
    Scanner input = new Scanner(System.in);
    int offset = input.nextInt();
    long totalMilliSeconds = System.currentTimeMillis();
    long totalSeconds = totalMilliSeconds / 1000;
    long currentSeconds = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    long currentMinutes = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    long currentHours = totalHours % 24;
    long offsetHours = currentHours + offset;
    if (offsetHours < 0) {
      offsetHours = offsetHours + 24;
    }
    System.out.println ("The current time is " + offsetHours + ":" + currentMinutes + ":" + currentSeconds);
  }
}
