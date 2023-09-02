// Write a Java program that creates a new text file and writes some sample text data into it.

package assignment8.IOsream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTextFile {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Change to your desired file name
        String textData = "This is some sample text data that will be written to the file.";

        try {
            // Create a FileWriter and BufferedWriter to write to the file
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write the text data to the file
            bufferedWriter.write(textData);

            // Close the BufferedWriter to ensure data is flushed and the file is properly
            // closed
            bufferedWriter.close();

            System.out.println("File '" + fileName + "' has been created and written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while writing to the file.");
        }
    }
}
