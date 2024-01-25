package OOP;

public class Encapsulation {
    private String studentName;
    private int studentID;
    private String studentAddress;
    private double studentGPA;

    public String getStudentName(){
        return studentName;
    }

    public int getStudentID(){
        return studentID;
    }

    public String getStudentAddress(){
        return studentAddress;
    }

    public double getStudentGPA(){
        return studentGPA;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public void setStudentId(int id){
        if(id > 0){
            studentID = id;
        }
        else{
            System.out.println("Invalid ID.");
        }
    }

    public void setStudentAddress(String address){
        studentAddress = address;
    }

    public void setStudentGPA(double gpa){
        if(gpa > 0){
            studentGPA = gpa;
        }
        else{
            System.out.println("Invalid GPA.");
        }
    }
    
}
