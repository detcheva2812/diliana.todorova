package Homework1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter side A of the triangle in cm:");
        double sideA = scanner.nextDouble();

        System.out.println("Enter the height in cm:");
        double height = scanner.nextDouble();

        double area = (double) sideA * height / 2;

        System.out.printf("The area of the triangle is: %f", area);
    }
}
