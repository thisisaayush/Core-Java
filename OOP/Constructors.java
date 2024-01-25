package OOP;

public class Constructors {
    int x; 
    int y;

    //no parameter constructor.
    public Constructors(){
        x = 5;
    }

    //parameter constructor.
    public Constructors(int a , int b){
        x = a;
        y = b;
    }

    public static void main(String[] args){

        //for no parameter Constructors.
        Constructors myObj1 = new Constructors();
        System.out.println("x: " + myObj1.x);

        //for parameter Constructors.
        Constructors myObj2 = new Constructors(5, 6);
        System.out.println("x: " + myObj2.x + ", y: " + myObj2.y);
    }
}
