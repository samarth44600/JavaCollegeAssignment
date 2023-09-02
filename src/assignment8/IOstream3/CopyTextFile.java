// Create a Java program that copies the contents of one text file into another. Implement
// file input and output streams to achieve the file copying operation.

package assignment8.IOstream3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTextFile {
    public static void main(String[] args) {
        String sourceFileName = "source.txt"; // Replace with the name of your source file
        String destinationFileName = "destination.txt"; // Replace with the name of your destination file

        try {
            // Create a FileInputStream to read from the source file
            FileInputStream sourceFileInputStream = new FileInputStream(sourceFileName);

            // Create a FileOutputStream to write to the destination file
            FileOutputStream destinationFileOutputStream = new FileOutputStream(destinationFileName);

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from the source file and write to the destination file
            while ((bytesRead = sourceFileInputStream.read(buffer)) != -1) {
                destinationFileOutputStream.write(buffer, 0, bytesRead);
            }

            // Close the input and output streams
            sourceFileInputStream.close();
            destinationFileOutputStream.close();

            System.out.println("File '" + sourceFileName + "' copied to '" + destinationFileName + "' successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while copying the file.");
        }
    }
}
