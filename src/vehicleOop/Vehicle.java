package vehicleOop;

public class Vehicle {

    private String model;
    private String color;
    private boolean isNew;
    private float price;

    public Vehicle(String model, String color, boolean isNew, float price) {
        this.model = model;
        this.color = color;
        this.isNew = isNew;
        this.price = price;
    }
    public Vehicle(){
    }

    public void drive(){
        System.out.println("Drive! ");
    }
    public void reverse(){
        System.out.println("Reverse! ");
    }
    public void stop(){
        System.out.println("Stop ! ");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void aboutVeh (){
        System.out.println("Model "+model + ";\nColor: " + color + ";"+" \nIsNew: " + isNew + ";\nPrice: "+ price );
    }
}
