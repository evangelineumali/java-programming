public class PrintTable {
  public static void main(String[] args) {
  // Exercise 1.4 Print a table
    System.out.println ("a     a^2     a^3");
    for ( int x = 1; x < 5; x++ ) {
      if ( x > 3 ) {
        System.out.println ( x + "     " + ( x * x ) + "      " + ( x * x * x ));
        }
      else {
        System.out.println ( x + "     " + ( x * x ) + "       " + ( x * x * x));
        }
    }
  }
}