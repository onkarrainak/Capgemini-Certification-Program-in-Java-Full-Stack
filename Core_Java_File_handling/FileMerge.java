package onkar.Core_Java_File_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the first file: ");
        String file1 = scanner.nextLine();

        System.out.print("Enter the path of the second file: ");
        String file2 = scanner.nextLine();

        System.out.print("Enter the name of the merged file: ");
        String mergedFile = scanner.nextLine();

        mergeFiles(file1, file2, mergedFile);

        scanner.close();
    }

    public static void mergeFiles(String file1, String file2, String mergedFile) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile));

            String line;

            // Merge demo
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Merge demo1
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Close all
            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while merging files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
