// Make a class named Employee with private member variables name, age, and public
// functions to set, display and return values of member variables. Then create five objects
// of the Employee class, set them and display the name of youngest Employee in the main
// function of another class named EmpDemo.

package assignment5;

class Employee {
    private String name;
    private int age;

    // Setter method to set the name and age of the employee
    public void setEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method to print the employee's name and age
    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter method to return the age of the employee
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

// Clasname = EmpDemo
public class EmpDemo4 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Create five Employee objects and set their information
        employees[0] = new Employee();
        employees[0].setEmployee("Alice", 28);

        employees[1] = new Employee();
        employees[1].setEmployee("Bob", 35);

        employees[2] = new Employee();
        employees[2].setEmployee("Charlie", 22);

        employees[3] = new Employee();
        employees[3].setEmployee("David", 31);

        employees[4] = new Employee();
        employees[4].setEmployee("Eve", 26);

        // Find and display the name of the youngest employee
        int youngestAge = employees[0].getAge();
        String youngestName = employees[0].getName();

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getAge() < youngestAge) {
                youngestAge = employees[i].getAge();
                youngestName = employees[i].getName();
            }
        }

        System.out.println("Youngest Employee: " + youngestName);
    }
}

// Output
// Youngest Employee: Charlie