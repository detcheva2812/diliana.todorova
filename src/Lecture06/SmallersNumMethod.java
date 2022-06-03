package Lecture06;


public class SmallersNumMethod {
    public static void main(String[] args) {

        findSmallestNum(5, 6, 4);

    }

    public static void findSmallestNum(int a, int b, int c) {

        if (a <= b && a <= c) {
            System.out.printf("The smallest number is: %d.", a);
        } else if (b <= a && b <= c) {
            System.out.printf("The smallest number is: %d.", b);
        } else {
            System.out.printf("The smallest number is: %d.", c);
        }

    }
}
