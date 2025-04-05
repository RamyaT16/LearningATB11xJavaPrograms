// Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
package Task;

import java.util.Scanner;

public class maxnumber {
    public static void main(String[] args) {
        //int a = Integer.parseInt(args[0]);
       // int b = Integer.parseInt(args[1]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number" );
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
     int c = (a>b)? a : b;
        System.out.println("Maximum of two number is:" +c);
    }
}

