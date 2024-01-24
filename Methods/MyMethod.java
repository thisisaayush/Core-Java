package Methods;

public class MyMethod {
    public static String CheckMethods1(){
        int x = 10;

        if (x < 10) {
            return ("x < 10");
        }

        else {
            return ("x > 10");
        }
    }

    public static void CheckMethods2(int num){
        
        for(int i = 2; i <= num; i++){
            if (num < 2){
                System.out.println(num+ ": Print Not Prime.");
                break;
            }
            else if(num == 2){
                System.out.println(num + ": Print Prime.");
                break;
            }
            else if (num % i == 0){
                System.out.println(num + ": Print Not Prime.");
                break;
            }
            else {
                System.out.println(num + ": Print Prime.");
                break;
            }
        }
    }

    public static int addMethod(int x, int y){
        return x + y;
    }

    public static double addMedthod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(CheckMethods1());
        CheckMethods2(8);

        System.out.println("Int: " + addMedthod(10, 15));
        System.out.println("Double: " + addMedthod(3.14, 6.83));
    }
    
}
