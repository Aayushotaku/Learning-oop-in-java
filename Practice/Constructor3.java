package Practice;
// Question 3 (Constructor Overloading with Multiple Parameters)
// Modify the Car class to include constructor overloading by adding a third constructor that takes three parameters:

// String name (Car brand)
// double price (Car price)
// String fuelType (Fuel type, e.g., "Petrol", "Diesel", "Electric")
// In the main method, create:

// One object using the non-parameterized constructor
// One object using the two-parameter constructor
// One object using the three-parameter constructor
// Call display() for all objects and check if the values are assigned correctly.
class Car {
    String name;
    double price;
    int doors;

    // Non-Parameterized Constructor (Default Values)
    public Car() {
        this.name = "Unknown";
        this.price = 0.0;
        this.doors = 0;
    }

    // Two-Parameter Constructor
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
        this.doors = 0; // Default value if not provided
    }

    // Three-Parameter Constructor
    public Car(String name, double price, int doors) {
        this.name = name;
        this.price = price;
        this.doors = doors;
    }

    void display() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Price: " + price);
        System.out.println("Number of Doors: " + doors);
        System.out.println("----------------------");
    }
}

public class Constructor3 {
    public static void main(String[] args) {
        Car c1 = new Car(); // Calls Non-Parameterized Constructor
        c1.display();

        Car c2 = new Car("Lambo", 100000.000); // Calls Two-Parameter Constructor
        c2.display();

        Car c3 = new Car("BMW", 10000000.00, 4); // Calls Three-Parameter Constructor
        c3.display();
    }
}

