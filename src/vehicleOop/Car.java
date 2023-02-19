package vehicleOop;

public class Car extends Vehicle {

    public Car(String model, String color, boolean isNew, float price) {
        super(model, color, isNew, price);
    }

    public Car() {
    }

    public void about(){
        System.out.println(getModel());
    }




}
