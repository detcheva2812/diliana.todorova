package Lecture04;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 7:");
        int userInput = Integer.parseInt(scanner.nextLine());
        String suffix = "th";
        String day = null;

        switch (userInput) {
            case 1:
                suffix = "st";
                day = "Monday";
                break;
            case 2:
                suffix = "nd";
                day = "Tuesday";
                break;
            case 3:
                suffix = "rd";
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                System.out.println("Invalid day of the week!");
        }

        if (userInput > 0 && userInput < 8) {
            System.out.printf("The %d-%s day of the week is %s", userInput, suffix, day);
        }
    }
}
