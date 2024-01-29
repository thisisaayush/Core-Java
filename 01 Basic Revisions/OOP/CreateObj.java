package OOP;

public class CreateObj {
    int x = 5;
    int y ;

    public static void main(String[] args) {
        CreateObj myObj = new CreateObj();
        myObj.y = 50;
        System.out.println(myObj.x);
        System.out.println(myObj.y);
    }
    
}
