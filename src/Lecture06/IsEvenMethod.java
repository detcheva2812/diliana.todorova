package Lecture06;

import java.util.Scanner;

public class IsEvenMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println(isEven(a));

    }

    public static boolean isEven (int a){
        return a % 2 == 0;
    }
}
