package Variable;

public class FinalExample {
     final static int a = 10 ; // Final Variable
    public static void main(String[] args) {
       
         a = 20 ; // Error: Cannot assign a value to final variable 'a'
        System.out.println("Value of a: " + a); // Output: Value of a: 10
        System.out.println("Value of a: " + FinalExample.a); // Output: Value of a: 10

        // Final variables cannot be reassigned once they are initialized.
        // Uncommenting the line 'a = 20;' will result in a compilation error.

    
    }
    
}
