package Switch_Statement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch_Scanner_classmethod {
    public static void main(String[] args) {
        /** Syntax   switch statements used for multiple conditions. Java switch expression must be byte, int, enum, short, long.
         * no variables only constants and literals.
         * switch (expression){
         * case 1:
         * break;
         * case2 :
         * break;
         * default:
         * break;  ---> is optional to come out of the case
         *
         */
        //int a = Integer.parseInt(args[0]);// CLI option
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value from 1 to 7 to tell which day it is");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(" Invalid day");
                break;
        }

        }
    }

