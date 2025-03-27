package Type_Casting;
//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
//Logical building
/** a >= 100 A
 * a >=89 B
 * a>= 79 C
 * a >= 69 D
 * a<=59 F
 */
public class grade_class {
    public static void main(String[] args) {
        int x = 76;
        String y = ((x>=100)? "A" : (x>=89)? "B" :(x>=79)?"C" :(x>=69)? "D": "Fail");
        System.out.println(y);
    }
}
