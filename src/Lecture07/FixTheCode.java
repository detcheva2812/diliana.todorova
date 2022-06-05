package Lecture07;

import java.io.FileWriter;

import java.io.IOException;
import java.util.Scanner;

class FixThisCode {

    private static FileWriter getFileWriter(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
        } catch (IOException ioe1) {
            System.out.println("IOException one caught");
        }
        return null;
    }

    protected static void closeFileWriter(FileWriter fileWriter) {
        try {
            fileWriter.close();
        } catch (IOException ioe2) {
            System.out.println("IOException two caught.");
        }
    }

    public static void printToFile(FileWriter fileWriter, String text,
                                   int repeat) {

        for (int i = 0; i < repeat; i++) {
            try {
                fileWriter.append(text).append("\n");
            } catch (IOException ioe3) {
                System.out.println("IOException three caught.");
            }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter file path: ");

        String filePath = scanner.nextLine();

        int howManyTimesToPrintTheTextToFile =
                scanner.nextInt();

        String textToAdd = scanner.nextLine();
        try {
            printToFile(getFileWriter(filePath), textToAdd,
                    howManyTimesToPrintTheTextToFile);
        }catch(NullPointerException npe){
            System.out.println("Null pointer Exception caught.");
        }



    }
}
