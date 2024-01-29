package OOP;

class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }

    
    public String animalColor(){
        return "Animal color.";
    }

    public void animalSound(){
        System.out.println("Animal sound.");
    }
}

class Dog extends Animal {
    public double strength;
    //create constructor.
    public Dog(String name){
        super(name);
    }

    public String animalColor(){
        return "Dog has brown hair.";
    }

    public void animalSound(){
        System.out.println("Dog barks!");
    }
}

class Cow extends Animal {
    public int legs = 4;
    //create constructor.
    public Cow (String name){
        super(name);
    }
    
    public String animalColor(){
        return "Cow has light orange and gray color.";
    }

}

public class Polymorphism {
    public static void main(String[] args){
        Animal myAnimal = new Animal("Animal");
        System.out.println(myAnimal.animalColor());

        Dog myDog = new Dog("Dog");
        myDog.animalSound();

        Cow myCow = new Cow("Cow");
        System.out.println(myCow.name);
    }
    
}
