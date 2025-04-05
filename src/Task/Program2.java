package Task;

public class Program2 {
        public static void main(String[] args) {
            int a = 20;
            System.out.println(--a + a++ + a--);

    }
}
/**
 * a = 20
 * --a first decrease and the assign that is --a is 19
 * a++ first assign and the increase ie.. a++ is 19 next a value is 20.
 * a-- is first assign then decrease ie.. a-- is 20 next value is 19
 * 19+19+20 = 58
 */