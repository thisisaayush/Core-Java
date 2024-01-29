package Methods;
import java.io.*;
import java.util.*;

public class Recursion {
    public static void main(String[] args){
        int n = 7;
        System.out.println(fibonacci(n));

        int[] seqFebo = new int[n];

        for (int i = 0; i < n; i++){
            seqFebo[i] = fibonacci(i);
        }

        System.out.println(Arrays.toString(seqFebo));
    }

    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
