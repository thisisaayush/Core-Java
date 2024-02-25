public class Polymorphism {
    public static void main (String [] args){
        Animal animal = new Animal();
        animal.sound();
        animal.speed();

        Animal dog1 = new Dog(); // this is called polymorphism or upcasting and can only access methods of Animal class.
        dog1.sound();

        Dog dog2 = new Dog(); // this is called object instantiation, and can access methods of both Animal and Dog classes.
        dog2.sound();
        dog2.fur();

        Cat cat = new Cat();// this is called object instantiation, and can access methods of both Animal and Cat classes.
        cat.jumps();
        cat.speed();
    }
}

class Animal {
    public void sound(){
        System.out.println("Animals make noise.");
    }

    public void speed(){
        System.out.println("Animals run fast.");
    }
}

class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("Dog barks!");
    }

    public void fur(){
        System.out.println("Dogs have fur!");
    }
}

class Cat extends Animal {
    @Override
    public void speed() {
        System.out.println("Cat is fast!");
    }

    public void jumps() {
        System.out.println("Cat jumps high!");
    }
}