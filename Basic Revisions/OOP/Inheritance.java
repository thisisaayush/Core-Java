package OOP;
import javax.swing.text.View;

class Vehicle {
    protected String brand = "Ford";
    public String model;
    public String color;
    public String cost;
    public void honk(){
        System.out.println("Car honks!");
    }
}

class Car extends Vehicle {
    public String manufacturedState = "Minnesota";

    public void mileage(){
        System.out.println("Mileage is good.");
    }

}

public class Inheritance  {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.model = "xa8";
        myCar.cost = "$ 65k";
        System.out.println("Model: " + myCar.model);
        myCar.honk();
        myCar.mileage();
    }
    
}
