package Variable;

public class InstanceVar {

    int a  = 20 ; // Instance Variable
    public static void main(String[] args) {

        InstanceVar obj = new InstanceVar();
        System.out.println("Value of a: " + obj.a); // Output: Value of a: 20
        
    }
}


//=======================================================================
// 🔹 Explanation
// In this code, we have an instance variable 'a' which is initialized to 20.
// In the main method, we create an object of the InstanceVar class and access the instance variable 'a' using that object.
// The output will be "Value of a: 20" as expected.
// Instance variables are associated with an instance of a class and can be accessed using the object of that class.
//=======================================================================