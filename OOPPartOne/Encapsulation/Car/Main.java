package OOPPartOne.Encapsulation.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setCompany("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("Company = " + car.getCompany());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setCompany("Porsche Targa");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");
        targa.describeCar();

        Car newProduct = new Car();
        newProduct.setCompany("Tesla");
        newProduct.setModel("Model XX");
        newProduct.setColor("Gray Light");
        newProduct.setDoors(1);
        newProduct.describeCar();

    }
}
