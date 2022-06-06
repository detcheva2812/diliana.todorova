package Lecture05;

import java.util.Scanner;

public class Matrix2DUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2D matrix number of rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter 2D matrix number of columns : ");
        int columns = scanner.nextInt();

        System.out.printf("Enter %d integers (each on new line):%n ", columns * rows);

        int[][] twoD = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoD[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Data you entered : ");
        for (int[] el : twoD) {
            for (int elem : el) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
