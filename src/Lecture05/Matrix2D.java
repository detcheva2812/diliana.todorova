package Lecture05;

public class Matrix2D {
    public static void main(String[] args) {

        int[][] arr = {
                {10, 15, 20},
                {25, 30, 35},
                {40, 45, 50},
                {55, 60, 65}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
