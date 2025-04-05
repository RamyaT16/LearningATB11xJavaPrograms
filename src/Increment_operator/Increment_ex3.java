package Increment_operator;

public class Increment_ex3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a++ + a);
        // here a++ is post inc first print then inc thst is a++ is 10
        /** a++ is A that is EXPA is 11.  a is 12
         * +
         * a is B EXPB = 12
         * EXPA + EXPB = 11 + 12 = 23
         */
        System.out.println(a++ + ++a);
        // 12 + 14 = 26
    }
}
