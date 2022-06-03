package Lecture06;

import java.util.Scanner;

public class CountWordsMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        System.out.printf("The words in the string are %d.", countWords(inputArr));
    }

    public static int countWords(String[] inputArr){
        return inputArr.length;
    }
}
