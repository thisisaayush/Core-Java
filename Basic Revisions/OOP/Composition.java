package OOP;

// Engine class representing the engine of a car
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine starts.");
    }

    public void stop() {
        System.out.println("Engine stops.");
    }
}

// Car class representing a car that has an Engine
class Car {
    private String model;
    private Engine carEngine; // Composition: Car HAS-A Engine

    public Car(String model, Engine engine) {
        this.model = model;
        this.carEngine = engine;
    }

    public void startCar() {
        System.out.println(model + " starts.");
        carEngine.start(); // Delegating the start action to the Engine
    }

    public void stopCar() {
        System.out.println(model + " stops.");
        carEngine.stop(); // Delegating the stop action to the Engine
    }
}

public class Composition {
    public static void main(String[] args) {
        // Creating an Engine
        Engine v8Engine = new Engine("V8");

        // Creating a Car with the Engine
        Car myCar = new Car("Sedan", v8Engine);

        // Starting and stopping the Car
        myCar.startCar();
        myCar.stopCar();
    }
}
