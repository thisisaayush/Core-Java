package OOP;

public class SecondAbstracts {
    public static void main(String[] args){
        Student myStudent = new Student();
        myStudent.degree = "Software Engineering";

        System.out.println("Name: " + myStudent.fname + "     Degree: " + myStudent.degree);
        myStudent.study();
    }
    
}
