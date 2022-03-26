package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {

    public static void Ex1() throws FileNotFoundException {
        FileInputStream file = null;
        try {
            file = new FileInputStream("file.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error, the file could not be found");
            System.exit(1);
        }
        finally {
            Scanner input = new Scanner(file);
            while
            (input.hasNext()) {
                System.out.println(input.nextLine());
            }
        }
    }
}
