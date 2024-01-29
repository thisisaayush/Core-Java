package Inheritance.BasicInheritance;

public class Dog extends Animal {
    public String furColor;

    public Dog(String color){
        super("Shepherd", "Huge", 180);
        this.furColor = color;
    }
    
}
