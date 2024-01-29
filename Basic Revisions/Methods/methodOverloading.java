package Methods;
//Method overloading in Java occurs when you have multiple methods in the same class with the same name 
//but different parameter lists (number, type, or order of parameters). 
public class methodOverloading {
     // Method to add two integers
     public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        methodOverloading methodOverloading = new methodOverloading();

        // Using the add method with two integers
        System.out.println("Addition of 5 and 10: " + methodOverloading.add(5, 10));

        // Using the add method with three integers
        System.out.println("Addition of 5, 10, and 15: " + methodOverloading.add(5, 10, 15));

        // Using the add method with two doubles
        System.out.println("Addition of 3.5 and 2.7: " + methodOverloading.add(3.5, 2.7));

        // Using the concatenate method with two strings
        System.out.println("Concatenation of 'Hello' and 'World': " + methodOverloading.concatenate("Hello", "World"));
    }
}
