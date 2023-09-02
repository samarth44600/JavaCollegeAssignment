// 1. Create a Class name Student. Declare a variable studentName as String. Create another
// class School which extends the class Student and declare a variable schoolName. Add a
// main function to class School. In the main function set the variables of both class and
// display them as (Alex studies in NCCM) where „Alex‟ and „NCCM are the variables.
// Hint:
// public static void main(){
// School school=new School();
// school.schoolName=”NCCM”;
// school.studentName=”Alex”;
// System.out.println(studentName+“ studies in ”+schoolName)
// }
// a. In the class Student, add a function displayDetails(), inside the function display
// the studentName set previously. Call the function from School class.
// b. In School class, create a functon displayDetails(), inside the function display the
// schoolName set previously. Now call both the function. Hint: Use super to call
// the function of parent.

package assignment3;

class Student {
    String studentName;

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
    }
}

 // Replace class name with School
class School1 extends Student {

    String schoolName;

    public void displayDetails() {
        super.displayDetails(); // Calling the displayDetails() method of the parent class
        System.out.println("School Name: " + schoolName);
    }

    public static void main(String[] args) {
        School1 school = new School1();
        school.schoolName = "NCCM";
        school.studentName = "Alex";

        System.out.println(school.studentName + " studies in " + school.schoolName);

        school.displayDetails(); // Calling the displayDetails() method of the School class
    }
}



// Output
// Alex studies in NCCM
// Student Name: Alex
// School Name: NCCM