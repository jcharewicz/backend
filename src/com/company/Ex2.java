package com.company;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ex2 {

    public static void Ex2() throws FileNotFoundException {

        System.out.println("Ex 2 - The text is being saved to a OutputFile.txt");
        FileOutputStream outputFile = null;
        try {
            outputFile = new FileOutputStream("OutputFile.txt", false);
        } catch (FileNotFoundException e) {
            System.out.println("Error, the file could not be saved");
            System.exit(1);
        } finally {
            PrintWriter printWriter = new PrintWriter(outputFile);
            printWriter.println("Ex 2 - Test");
            printWriter.close();
        }

    }
}
