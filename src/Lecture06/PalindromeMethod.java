package Lecture06;

import java.util.Scanner;

public class PalindromeMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer in order to check if it is a palindrome or not: ");
        String positiveInt = scanner.nextLine();

        System.out.println(isPalindrome(positiveInt));
    }

    public static boolean isPalindrome (String positiveInt){
        StringBuilder reversedInput = new StringBuilder();

        for (int i = (positiveInt.length() - 1); i >= 0; --i) {
           reversedInput.append(positiveInt.charAt(i));
        }

        return positiveInt.equalsIgnoreCase(reversedInput.toString());

    }
}
