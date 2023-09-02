// Write a Java program that uses a HashMap to store key-value pairs representing student
// names and their corresponding grades. Allow users to add, remove, and lookup grades by
// entering student names.

package assignment9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeTracker3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> gradeMap = new HashMap<>();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add student and grade");
            System.out.println("2. Remove student");
            System.out.println("3. Lookup student grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student's grade: ");
                    int studentGrade = scanner.nextInt();
                    gradeMap.put(studentName, studentGrade);
                    System.out.println(studentName + "'s grade added.");
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (gradeMap.containsKey(nameToRemove)) {
                        gradeMap.remove(nameToRemove);
                        System.out.println(nameToRemove + "'s grade removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to lookup grade: ");
                    String nameToLookup = scanner.nextLine();
                    Integer grade = gradeMap.get(nameToLookup);
                    if (grade != null) {
                        System.out.println(nameToLookup + "'s grade: " + grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
