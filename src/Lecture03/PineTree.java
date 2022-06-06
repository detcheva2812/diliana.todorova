package Lecture03;

import java.util.Scanner;

public class PineTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of lines:");
        int lines = scanner.nextInt();

        for (int i = 0; i < lines * 2; i += 2) {
            for (int j = lines - i / 2 - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
