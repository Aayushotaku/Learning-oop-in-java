package Practice;
// Create a base class Person with attributes name and age.
// Create two subclasses:

// Student (inherits from Person, adds grade attribute).
// Teacher (inherits from Person, adds subject attribute).
// In the main method:

// Create a Student object and set name, age, and grade.
// Create a Teacher object and set name, age, and subject.
// Display details of both objects.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);  // Call Person's constructor
        this.grade = grade;
    }
}

class Teacher extends Student {
    String subject;

    Teacher(String name, int age, String grade, String subject) {
        super(name, age, grade);  // Call Student's constructor
        this.subject = subject;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Person p1 = new Person("Aayush", 20);
        System.out.println(p1.name + "  " + p1.age);

        Student s1 = new Student("Luffy", 20, "A");
        System.out.println(s1.name + "  " + s1.age + "  " + s1.grade);

        Teacher t1 = new Teacher("Rayleigh", 80, "A+", "Haki");
        System.out.println(t1.name + "  " + t1.age + "  " + t1.grade + "  " + t1.subject);
    }
}

