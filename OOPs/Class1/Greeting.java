package Class1;
import static Class2.Message.showMessage; // import specific method of Class2 package
// import Class2.*; // import all classes of Class2 package
public class Greeting {
    public static void main(String[] args) {
        System.out.println("This is Packages Class in Class1 Package");
        // write greeting , message , wish etc.
        System.out.println("Hello, Welcome to Java Programming");
        showMessage();
    }
}
