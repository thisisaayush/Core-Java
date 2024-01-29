package OOP;

abstract class Abstract {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method 
  }
  
  // Subclass (inherit from Main)
class Student extends Abstract {
    public String degree;
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
      System.out.println("Studying all day long");
    }
  }

public class Abstracts {
    public static void main(String[] args){
        Student myStudent = new Student();
        myStudent.degree = "Software Engineering & AI";

        System.out.println("Name: " + myStudent.fname + "     Degree: " + myStudent.degree);
        myStudent.study();
    }
    
}

  