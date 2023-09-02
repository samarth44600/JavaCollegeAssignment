// Write a Java program that uses DataInputStream and DataOutputStream to read and write
// binary data to a file. Implement functionality to read and write various data types (e.g.,
// int, double, boolean) to and from the file.

package assignment8.IOstream5;

import java.io.*;

public class BinaryFileReadWrite {
    public static void main(String[] args) {
        String fileName = "data.dat"; // Specify the file name

        // Write data to the binary file
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            // Writing various data types to the file
            dataOutputStream.writeInt(42);
            dataOutputStream.writeDouble(3.14159265359);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeUTF("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while writing to the file.");
        }

        // Read data from the binary file
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            // Reading various data types from the file
            int intValue = dataInputStream.readInt();
            double doubleValue = dataInputStream.readDouble();
            boolean booleanValue = dataInputStream.readBoolean();
            String stringValue = dataInputStream.readUTF();

            // Displaying the read data
            System.out.println("Read int value: " + intValue);
            System.out.println("Read double value: " + doubleValue);
            System.out.println("Read boolean value: " + booleanValue);
            System.out.println("Read string value: " + stringValue);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while reading from the file.");
        }
    }
}
