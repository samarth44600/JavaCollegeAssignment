// Develop a program that reads and displays the contents of an existing text file. Use
// classes like FileInputStream to efficiently read and print the file's content.

package assignment8.IOstream2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Replace with the name of your text file

        try {
            // Create a FileInputStream to read the file
            FileInputStream fileInputStream = new FileInputStream(fileName);

            // Create an InputStreamReader to read bytes as characters
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

            // Create a BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            System.out.println("Contents of the file '" + fileName + "':");

            // Read and print each line of the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader, InputStreamReader, and FileInputStream
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while reading the file.");
        }
    }
}
