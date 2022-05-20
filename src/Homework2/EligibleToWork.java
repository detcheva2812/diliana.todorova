package Homework2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int age = Integer.parseInt(scanner.nextLine());

        if (age > 0 && age < 100) {
            if (age >= 16) {
                System.out.println("You are eligible to work!");
            } else {
                System.out.println("You are not eligible to work as you are too young!");
            }
        } else {
            System.out.println("Invalid input! The input must be a positive number and less than 100.");
        }
    }
}
