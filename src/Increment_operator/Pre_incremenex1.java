package Increment_operator;

public class Pre_incremenex1 {
    public static void main(String[] args) {
         int a = 10;
         int b = ++a;
        System.out.println(b);
        System.out.println(a);
    }
    // ++a value is increment first and then stored in the result.
    // value is increased by 1
/** result table
 * line number |a| Result b
 * 5 |10 | NA
 * 6 |11 | 11
 * 7 |not printing |11
 * 8 | 11 | not printing
 */
}
