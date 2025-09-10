package Recursion;
import java.util.*;

public class Fibbonacci {

    public static void main(String[] args) {
        int n = 4; // Example input
        int ans = fibonacci(n);
        System.out.println("Fibonacci of " + n + " is: " + ans);   
    }
    
    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
