package Inheritance.IntermediateInheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Husky", "Big", 80);
    }

    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, "Big", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        System.out.print(  "Dog barks and makes noise.");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
    }
}
