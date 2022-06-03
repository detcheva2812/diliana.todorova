package Lecture06;

import java.util.Scanner;

public class MiddleCharacterMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string in order to find the middle character/s: ");
        String input = scanner.nextLine();
        findMiddleChar(input);
    }

    public static void findMiddleChar(String input) {
        if (input.length() % 2 == 1) {
            //odd --> 1 character will be middle
            System.out.println(input.charAt(input.length() / 2));
        } else {
            //even --> 2 characters will be middle
            System.out.println(input.charAt(input.length()/2 -1) + "" + input.charAt(input.length()/2) );
        }
    }
}
