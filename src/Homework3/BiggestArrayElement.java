package Homework3;

import java.util.Scanner;

public class BiggestArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = {10, 20, 30, 40, 50.5, 60.3, 88.9};

        double max = Double.MIN_VALUE;

        for (double el : arr) {
            if (el > max) {
                max = el;
            }
        }
        System.out.printf("The biggest element of the array is %.2f", max);
    }
}
