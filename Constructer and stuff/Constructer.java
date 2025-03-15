
class Student{
    String name;
    int age;
    int symbolNumber;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.symbolNumber);
    }

    Student(){
        System.out.println("Nothging no value will be passed or anything");
    }


}
public class Constructer {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name= "Aayush";
        student1.age= 19;
        student1.symbolNumber=333;

        student1.info();
        
    }

}
