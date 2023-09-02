// Create a Java program that reads a text file using BufferedReader. Prompt the user to
// enter the name of a file to read, and then display the content of the file line by line.

package assignment8.IOstream4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTextFileWithPrompt {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the name of the file to read: ");
            String fileName = reader.readLine();

            // Create a FileReader and BufferedReader to read the file
            FileReader fileReader = new FileReader(fileName);
            BufferedReader fileBufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("Contents of the file '" + fileName + "':");

            // Read and display each line of the file
            while ((line = fileBufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader and FileReader
            fileBufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while reading the file.");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
