package Lecture04;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the array length (positive number):");
        int length = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter an integer to fill in the Array:");
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }

        for (int item : numbers) {
            if (item > 150) {
                System.out.println("Number greater than 150 encountered and iteration stopped.");
                break;
            }
            if (item % 5 == 0) {
                System.out.printf("%d is divisible by 5.%n", item);
            }
        }
    }

}

