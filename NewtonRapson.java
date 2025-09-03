import java.util.Scanner;

public class NewtonRapson {

    public int sqrt(int x) {
        long y =  x;
        while (y * y > x) {
            y = (y + x / y) / 2;
        }            
        
        return (int) y;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int x = scanner.nextInt();
        scanner.close(); 
        NewtonRapson nr = new NewtonRapson();
        int result = nr.sqrt(x);   
        System.out.println(result);


        // Method second taking input 

        // NewtonRapson nr = new NewtonRapson();
        //  System.out.println(nr.sqrt(8)); 
    }
}
