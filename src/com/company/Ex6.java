package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

    public class Ex6
    {
        public static String Ex6() throws IOException {
            Path file = Path.of("file2.txt");
            String fileContent = Files.readString(file);
            String[] splittedText = fileContent.split("\n");
            String value = null;

            for(int i = 0; i < splittedText.length; ++i)
            {
                String part = splittedText[i];
                int counter = i + 1;
                String x = String.valueOf(counter);
                System.out.println(x + " " + part);
                value = x + " " + part;
            }
            return value;
        }
    }
