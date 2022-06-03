package Lecture04;

import java.util.Scanner;

public class LargestNumInArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largestNum = Integer.MIN_VALUE;
        System.out.println("Please enter the array length:");
        int length = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter an integer to fill in the Array:");
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }

        for (int item : numbers) {
            if (item > largestNum) {
                largestNum = item;
            }
        }
        System.out.printf("The largest number in the Array is %d.", largestNum);
    }
}



