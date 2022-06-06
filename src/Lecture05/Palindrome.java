package Lecture05;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversedString = "";

        for (int i = (input.length() - 1); i >= 0; --i) {
            reversedString += input.charAt(i);
        }

        if (input.equalsIgnoreCase(reversedString)) {
            System.out.println(input + " is a Palindrome String.");
        } else {
            System.out.println(input + " is not a Palindrome String.");
        }
    }
}

