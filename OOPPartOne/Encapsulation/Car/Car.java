package OOPPartOne.Encapsulation.Car;

public class Car {
    //Encapsulation Integration.
    private String company = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setCompany(String company) {

        if (company == null) company = "Unknown";
        String lowercaseMake = company.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla", "porsche targa" -> this.company = company;
            default -> {
                this.company = "Unsupported ";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println(doors + "-Door " +
                color + " " +
                company + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
