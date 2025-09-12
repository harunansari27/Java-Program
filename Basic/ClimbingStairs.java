package Basic;
import java.util.Scanner;

public class ClimbingStairs {
    
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1, b = 2, c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {

        // ✅ Method 1: Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: "); 
        int n = sc.nextInt();
        sc.close();

        ClimbingStairs cs = new ClimbingStairs();
        int result = cs.climbStairs(n);
        System.out.println("Number of ways: " + result);

        // ✅ Method 2: Hardcoded input
        // ClimbingStairs cs2 = new ClimbingStairs();
        // System.out.println(cs2.climbStairs(5)); // Output: 8  
    }
}
