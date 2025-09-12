package Basic;

public class DivideTwoInteger {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Handle overflow case
        }
        return dividend / divisor; // Use integer division
    }

    public static void main(String[] args) {
        DivideTwoInteger sol = new DivideTwoInteger();
        System.out.println(sol.divide(10, 3)); // Output: 3 
        System.out.println(sol.divide(-2147483648, -1));
    }
}
