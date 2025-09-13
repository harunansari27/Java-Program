package Variable;

public class LocalVar {

    public static void main(String[] args) {
        int a = 10 ;
        int b  ;

        System.out.println("Value of a: " + a + "and "+ "Value of b: " + b); // Error: Variable 'b' might not have been initialized
    }
    
}

//=======================================================================
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//  The local variable b may not have been initialized
// 	at Variable.LocalVar.main(LocalVar.java:7)
// Note: Local variables must be initialized before use.
// Value of a: 10and Value of b:
// at line 7, variable 'b' is declared but not initialized.
// Hence, it throws a compilation error.

//=======================================================================
// 🔹 Solution
// To fix this error, we need to initialize the variable 'b' before using it.
// For example, we can initialize 'b' with a value like this:
        // int b = 0 ;
// Now, the code will compile and run successfully, and the output will be:
// Value of a: 10and Value of b: 0

//=======================================================================


// 🔹 Reason for the Error
// In Java, local variables do not get default values.
// They must be initialized before use.
// In the given code, the variable b was declared but not assigned a value.
// When the program tried to use b, the compiler reported an error.

//=======================================================================