package Homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VacationAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter type of vacation (Beach or Mountain):");
        String vacationType = scanner.nextLine().toLowerCase();

        System.out.println("Please enter your budget (per day per person):");
        double budget = Double.parseDouble(scanner.nextLine());

        switch (vacationType){
            case "beach":
                if(budget < 50){
                    System.out.println("Your destination should be Bulgaria.");
                }else{
                    System.out.println("Your destination should be outside of Bulgaria.");
                }
                break;
            case "mountain":
                if(budget < 30){
                    System.out.println("Your destination should be Bulgaria.");
                }else{
                    System.out.println("Your destination should be outside of Bulgaria.");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation, check your spelling.");
        }
    }
}
