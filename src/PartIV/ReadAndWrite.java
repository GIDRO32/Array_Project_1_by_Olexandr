package PartIV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndWrite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             PrintWriter writer = new PrintWriter(new FileWriter(fileName + ".txt"))) {

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.printf("%3d: %s%n", lineNumber++, line);
            }
            System.out.println("Done.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

