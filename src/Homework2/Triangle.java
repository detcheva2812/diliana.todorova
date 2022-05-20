package Homework2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter angleA: ");
        double angleA = Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter angleB: ");
        double angleB = Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter angleC: ");
        double angleC = Double.parseDouble(scanner.nextLine());

        if (angleA > 0 && angleB > 0 && angleC > 0) {

            if (angleA + angleB + angleC == 180) {
                System.out.println("The triangle is possible to be built!");

                if (angleA == 90 || angleB == 90 || angleC == 90) {
                    System.out.println("It will be right-angled.");
                } else if (angleA < 90 && angleB < 90 && angleC < 90) {
                    System.out.print("It will be acute and more specifically ");

                    if (angleA == 60 && angleB == 60 && angleC == 60) {
                        System.out.println("equilateral.");
                    } else if (angleA == angleB || angleA == angleC || angleB == angleC) {
                        System.out.println("isosceles.");
                    } else {
                        System.out.println("multifaceted.");
                    }
                } else if (angleA > 90 || angleB > 90 || angleC > 90) {
                    System.out.println("It will be obtuse.");
                }
            } else {
                System.out.println("The triangle can't be built based on the angle values! Their sum does not equal 180 in total.");
            }
        } else {
            System.out.println("The triangle is not possible. Please enter positive values for the angles!");
        }
    }
}

