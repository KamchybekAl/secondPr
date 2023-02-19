package vehicleOop;

import vehicleOop.Bicycle;
import vehicleOop.Bus;
import vehicleOop.Car;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BWM", "Black", true, 35000);
        Bus myBus129= new Bus ("Isuzu","White",false,85000);
        Bicycle myBicycle = new Bicycle("Kroken","Blue",true,17500);
        myCar.aboutVeh();
        myCar.reverse();
        System.out.println("=================================================================");
        myBicycle.aboutVeh();
        myBicycle.drive();
        System.out.println("=================================================================");
        myBus129.aboutVeh();
        myBus129.stop();



    }
}