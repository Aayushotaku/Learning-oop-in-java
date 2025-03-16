# Abstraction in Java

Abstraction is a way of showing only the necessary information to the user and hiding the internal details of the system. It helps in reducing complexity and allows the programmer to focus on what the object does instead of how it does it.

## Types of Abstraction

1. **Data Abstraction**
2. **Control Abstraction**

### Data Abstraction

Data abstraction is a technique of showing only the required information to the user and hiding the internal details of the system. It can be achieved in two ways:
1. **Encapsulation**: Wrapping the data (variables) and code (methods) together into a single unit called a class.
2. **Information Hiding**: Restricting access to the internal details of an object using access modifiers like `private`, `protected`, and `public`.

#### Example of Data Abstraction

```java
// filepath: c:\Users\HP\Desktop\Learning oop in java\EncapulationAbstractionAndInterfaces\DataAbstractionExample.java

// Abstract class representing a generic vehicle
abstract class Vehicle {
    // Private variables to hide internal details
    private String model;
    private String engine;

    // Constructor to initialize the Vehicle object
    public Vehicle(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();
}

// Concrete class representing a Car, extending the Vehicle class
class Car extends Vehicle {
    // Constructor to initialize the Car object
    public Car(String model, String engine) {
        super(model, engine);
    }

    // Implementation of the abstract method
    @Override
    public void displayInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Engine: " + getEngine());
    }

    // Getter methods to access private variables
    public String getModel() {
        return super.model;
    }

    public String getEngine() {
        return super.engine;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Car object with model and engine details
        Car car = new Car("Tesla Model S", "Electric");
        // Displaying the car information
        car.displayInfo();
    }
}