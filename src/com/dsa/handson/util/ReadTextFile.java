package com.dsa.handson.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static String read(String filePath) {
        StringBuilder input = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                input.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input.toString();
    }
}
