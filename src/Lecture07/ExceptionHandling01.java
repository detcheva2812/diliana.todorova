package Lecture07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        try {
            System.out.println("Enter number a: ");
            a = scanner.nextInt();

            System.out.println("Enter number b: ");
            b = scanner.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("Your input must be an integer!");
            throw new RuntimeException();
        }

        try{
            System.out.println("a/b = " + a/b);
        }catch(ArithmeticException ae){
            System.out.println("Not possible to divide by zero!");
        }

    }
}
