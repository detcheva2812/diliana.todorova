package Homework1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first side of the triangle in cm:");
        double firstSide = scanner.nextDouble();

        System.out.println("Enter second side in cm:");
        double secondSide = scanner.nextDouble();

        System.out.println("Enter third side in cm:");
        double thirdSide = scanner.nextDouble();

        System.out.printf("The perimeter of the triangle is: %f", firstSide + secondSide + thirdSide);
    }
}
