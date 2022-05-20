package Homework2;

import java.util.Scanner;

public class RevenueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the unit price:");
        double unitPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter the sold quantity of the product:");
        int quantitySold = Integer.parseInt(scanner.nextLine());

        double priceWithoutDiscount = unitPrice * quantitySold;
        double discount = 0;
        String discountPercentage = "No discount";
        double revenue;

        if (quantitySold < 100) {
            revenue = priceWithoutDiscount;
        } else if (quantitySold <= 120) {
            discount = 0.15 * priceWithoutDiscount;
            revenue = 0.85 * priceWithoutDiscount;
            discountPercentage = "15%";
        } else {
            discount = 0.20 * priceWithoutDiscount;
            revenue = 0.80 * priceWithoutDiscount;
            discountPercentage = "20%";
        }

        System.out.printf("The revenue from the sale: %.2f$%n", revenue);
        System.out.printf("Discount: %.2f (%s)", discount, discountPercentage);
    }
}
