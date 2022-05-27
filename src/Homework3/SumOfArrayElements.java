package Homework3;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 45, 12, 3, 1, 5, 6};

        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        System.out.printf("The sum of all array elements is: %d", sum);
    }
}
