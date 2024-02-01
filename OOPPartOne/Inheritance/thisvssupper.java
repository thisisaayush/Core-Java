package OOPPartOne.Inheritance;

class SuperClass{
    public void printMethod(){
        System.out.println("Print SuperClass.");
    }
}

class SubClass extends SuperClass {
    @Override
    public void printMethod(){
        System.out.println("Print SubClass.");
    }
}

public class thisvssupper {
    public static void main(String[] args){
        SuperClass mySup = new SuperClass();
        mySup.printMethod();
        SubClass mySub = new SubClass();
        mySub.printMethod();
    }
}
