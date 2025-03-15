//Question 1 (Non-Parameterized Constructor)
// Write a Java program that defines a class Car. The class should have:

// A non-parameterized constructor that initializes a brand variable with the default value "Unknown".
// A method display() to print the brand.
// In the main method, create an object of Car and call the display() method.
package Practice;

class Car {
    String name;
    double price;

    // Non-Parameterized Constructor
    public Car() {
        System.out.println("Car object is created!");
    }

    void display() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Price: " + price);
    }
}

public class ConstructorPractice {
    public static void main(String[] args) {
        Car c1 = new Car(); // Calls the constructor
        c1.name = "Tesla";
        c1.price = 20000.00;
        c1.display();
    }
}


         


