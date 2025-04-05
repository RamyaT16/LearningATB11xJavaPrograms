package Type_Casting;

// Widening type casting means converting from smaller datatype to larger.
// It includes Implicit adn explicit.

/**Implicit is done by JVM automatically.
 * byte a =10;
 * int b = a; this is implicit
 *
 * byte c = 10;
 * int d = (int)c; this is explicit // not necessary for this to do as it is from smaller to larger.
 */
public class Widening_Casting {
    public static void main(String[] args) {
 byte a = 10;
 int b = a;// implicit casting/.
        System.out.println("Example for implicit casting" +b);

  byte c = 20;
  int d = (int)c;// explicit casting
        System.out.println("Example for explicit casting: \t" + d);
    }
}
