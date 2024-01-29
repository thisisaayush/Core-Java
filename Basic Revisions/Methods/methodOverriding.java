package Methods;
//The overriding method in the subclass has the same method signature as the method in the superclass.
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows!");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();  // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.makeSound();  // Output: Dog barks

        Cat cat = new Cat();
        cat.makeSound();  // Output: Cat meows

        // Polymorphism: Using the superclass reference to refer to a subclass object
        Animal someAnimal = new Dog();
        someAnimal.makeSound();  // Output: Dog barks
    }
}
