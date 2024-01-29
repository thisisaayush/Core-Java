package OOP;

abstract class Animal {
    public abstract void animalSound();
    public void energy(String name){
        System.out.println(name + " has tons of energy.");
    }
}

class Dog extends Animal {

    public Dog(){
        super();
    }
    public void animalSound(){
        System.out.println("Dog barks!");
    }
}

public class Abstraction {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.energy("Dog");
    }
}
