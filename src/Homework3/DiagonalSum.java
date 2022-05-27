package Homework3;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == j)
                    firstSum += arr[i][j];

                if ((i + j) == 3) {
                    secondSum += arr[i][j];
                }
            }
        }
        System.out.printf("The first sum of diagonal elements is: %d.", firstSum);
        System.out.printf("The second sum of diagonal elements is: %d.", secondSum);
    }
}



