In simple words Encapsulation is a process of wrapping up data and method that operates on enclosed data into a single unit. It is a way of bundling data and methods that operate on that data into a single unit called a class or object. This helps to hide the implementation details of an object from theoutside world and provides a way to interact with the object through awell-defined interface.
Example of Encapsulation in java
java
public class Employee {
private String name;
private int age;
private double salary;
public void setName(String name) {
this.name = name;
}
public void setAge(int age) {
this.age = age;
}
public void setSalary(double salary) {
this.salary = salary;
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
public double getSalary() {
return salary;
}
}
In the above example, the data members (name, age, salary) are private and can be accessed only through the public methods (setName, setAge, setSalary, getName, getAge, getSalary). This is an example of encapsulation in Java.
