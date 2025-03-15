// Define a class named Student
class Student {
    // Instance variables (Attributes of the Student class)
    String name;
    int age;
    int rollnumber;

    // Constructor to initialize a new Student object with given values
    Student(String name, int age, int rollnumber) {
        this.name = name; // Assigns the parameter value to the instance variable
        this.age = age;
        this.rollnumber = rollnumber;
    }

    // Copy Constructor: Creates a new Student object by copying an existing one
    Student(Student obj2) {
        this.name = obj2.name; // Copies the name from the given object
        this.age = obj2.age;   // Copies the age
        this.rollnumber = obj2.rollnumber; // Copies the roll number
    }

    // Method to display student information
    void info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollnumber);
    }
}

// Main class to execute the program
public class CopyConstructer {
    public static void main(String[] args) {
        // Creating the first Student object using the parameterized constructor
        Student student1 = new Student("Aayush", 19, 1);

        // Creating the second Student object using the copy constructor
        Student student2 = new Student(student1);

        // Calling the info() method to print the copied student details
        student2.info();
    }
}


