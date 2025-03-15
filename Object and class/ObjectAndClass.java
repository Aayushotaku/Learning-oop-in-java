// Defining a class named 'person'
// This class will have attributes and a method to display person details
class person {
    String name;  // Attribute to store the name of the person
    int age;      // Attribute to store the age of the person
    double salary; // Attribute to store the salary of the person
    String gender; // Attribute to store the gender of the person

    // Method to display the details of a person
    // the this is used to refer to the current object of the class
    public void write() {
        System.out.println("Name: " + this.name);  // Printing the name of the person
        System.out.println("Age: " + this.age);    // Printing the age of the person
        System.out.println("Salary: " + this.salary);  // Printing the salary of the person
        System.out.println("Gender: " + this.gender);  // Printing the gender of the person
    }
}

// Main class where execution begins
public class ObjectAndClass {
    public static void main(String[] args) {
        person person1 = new person(); // Creating an object of the 'person' class

        // Assigning values to the attributes of the object 'person1'
        person1.name = "Aayush";
        person1.age = 22;
        person1.salary = 200000.00;
        person1.gender = "Male";

        // Calling the 'write' method to display the details of 'person1'
        person1.write();
    }
}
