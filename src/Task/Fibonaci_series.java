package Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonaci_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int first = 0, second = 1;
                System.out.print("Fibonacci Series up to " + n + " terms: ");

                for (int i = 1; i <= n; i++) {
                    System.out.print(first + " ");

                    // compute next term
                    int next = first + second;
                    first = second;
                    second = next;
                }
            }
        }


