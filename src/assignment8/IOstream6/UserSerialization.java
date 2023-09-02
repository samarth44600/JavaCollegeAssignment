// Create a User class that includes attributes like name, age, and email. Implement a
// constructor and accessor methods (getters and setters) for these attributes.
// a. Develop a Java program that allows users to input their information (name, age,
// email) and creates a User object.
// b. Use ObjectOutputStream to serialize and write the User object to a file named
// "user_data.dat."
// c. Provide a confirmation message to the user indicating that their data has been
// successfully saved to the file.

package assignment8.IOstream6;

import java.io.*;

class User implements Serializable {
    private String name;
    private int age;
    private String email;

    // Constructor
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class UserSerialization {
    public static void main(String[] args) {
        // Input user information (name, age, email)
        String name = "John Doe";
        int age = 30;
        String email = "john.doe@example.com";

        // Create a User object
        User user = new User(name, age, email);

        // Serialize and write the User object to a file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("user_data.dat"))) {
            outputStream.writeObject(user);
            System.out.println("User data has been successfully saved to 'user_data.dat'.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred while writing to the file.");
        }
    }
}
