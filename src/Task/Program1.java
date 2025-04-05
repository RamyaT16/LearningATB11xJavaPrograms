package Task;

public class Program1 {
        public static void main(String[] args) {
            int a = 10;
            System.out.println(++a + a++ + a++);
            System.out.println(a);
        }
}
/** a = 10;
 * ++a is increment and increase value that is 11 +
 * a++ assign and increase 11 + next a value is 12
 * a++ is assign and increase that is 12 next a value is 13
 * 11 + 11 + 12 = 34
 * Then a = 13
 */