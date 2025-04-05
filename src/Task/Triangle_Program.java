/**Write a program that classifies a triangle based on its side lengths.
 * Given three input values representing the lengths of the sides,
 * determine if the triangle is equilateral (all sides are equal),
 * isosceles (exactly two sides are equal), or scalene (no sides are equal).
 * Use an if-else statement to classify the triangle.
 */
package Task;

import java.util.Scanner;

public class Triangle_Program {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lengths of the three sides
        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();

        // Check if the side lengths form a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        // Close the scanner object
        scanner.close();
    }

    // Method to check if the given side lengths form a valid triangle
    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}