package Inheritance;
//multiple inheritance
class Vechile{
    String name;
    int speed;
    int fuelcapacity;

    Vechile(String name, int speed, int fuelcapacity){
        this.name=name;
        this.speed=speed;
        this.fuelcapacity=fuelcapacity;
    }
}
class Car extends Vechile{
    int NumOfDoors;
    Car(String name, int speed, int fuelcapacity, int NumOfDoors){
        super(name, speed, fuelcapacity);
        this.NumOfDoors=NumOfDoors;
    }
    
}
class Bike extends Vechile{
    int NumOfGears;
    Bike(String name, int speed, int fuelcapacity, int NumOfGears){
        super(name, speed, fuelcapacity);
        this.NumOfGears=NumOfGears;
    }
}

public class PraticeQuestion2 {
    public static void main(String[] args) {
        Car car=new Car("Toyota", 120, 50, 4);
        Bike bike=new Bike("Honda", 100, 40, 5);
        System.out.println("Car: "+car.name+" "+car.speed+" "+car.fuelcapacity+" "+car.NumOfDoors);
        System.out.println("Bike: "+bike.name+" "+bike.speed+" "+bike.fuelcapacity+" "+bike.NumOfGears);
         
    }
}
