package Lecture03;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a:");
        double a = scanner.nextDouble();

        System.out.println("Enter number b:");
        double b = scanner.nextDouble();

        System.out.println("Enter number c:");
        double c = scanner.nextDouble();

        double result = b * b - 4.0 * a * c;

        double x1 = (-b + Math.sqrt(result)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(result)) / (2.0 * a);
        System.out.println("The roots are " + x1 + " and " + x2);

    }
}
