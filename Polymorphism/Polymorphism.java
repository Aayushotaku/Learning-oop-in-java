package Polymorphism;

// //What is Compile-Time Polymorphism?
// Compile-time polymorphism (also called method overloading) happens when:

// Multiple methods have the same name but different parameters (either in number, type, or both).
// The method call is resolved at compile-time based on the provided arguments.



class Calculate {
    // Method with two parameters
    public void sum(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }
    

    // Overloaded method with three parameters
    public void sum(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }

    // Overloaded method with different data types
    public void sum(double a, double b) {
        System.out.println("Sum of two double numbers: " + (a + b));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        
        // Calls the first method (two int parameters)
        c.sum(10, 20);

        // Calls the second method (three int parameters)
        c.sum(10, 20, 30);

        // Calls the third method (two double parameters)
        c.sum(5.5, 2.3);
    }
}
