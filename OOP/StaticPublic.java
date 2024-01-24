package OOP;

public class StaticPublic {
    public static void main(String[] args){
        //doesn't require the object of a class to access the code.
        myStaticMethod();
        myPublicMethod2();

        //must requrie the object of a class to access the code.
        StaticPublic myObj = new StaticPublic();
        myObj.myPublicMethod();
    }

    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects.");
    }
    
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects.");
    }

    public static void myPublicMethod2() {
        System.out.println("Public Static methods must be called by creating objects.");
    }
    
}
