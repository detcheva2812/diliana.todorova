package Homework2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArr = {10, 20, 30, 40, 50};

        System.out.println("Original Array is now reversed:");
        for (int i = originalArr.length - 1; i >= 0; i--)
            System.out.print(originalArr[i] + "  ");
    }
}
