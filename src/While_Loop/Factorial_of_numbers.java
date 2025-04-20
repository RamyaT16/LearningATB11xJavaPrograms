package While_Loop;

import java.util.Scanner;

public class Factorial_of_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for which factorial is required");
        int number = scanner.nextInt();
        int factorial = 1;
        if (number <=0){
            System.out.println(factorial);
        }else{
            for(int i=1; i<= number; i++) {
                factorial = factorial * i;
            }
                System.out.print("factorial of " +number+ " is :" +factorial);
            }
        }
    }

