package Increment_operator;

public class Task_increment {
        public static void main(String[] args) {
            int a = 10;
            System.out.println(++a + a++ + a++);
            System.out.println(a);
            /** |a | result of a
             * ++a is EXP1 a is 10, ++a is 11 increment and then store result
             * | 10 | 11
             * +
             * a++ is EXP2, then a++ is 11
             * +
             * a++ is EXP3, then a++ is 12 total answer is 34
             * a is 13
             */
        }
    }

