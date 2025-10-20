package ExceptionHandling;

public class Exceptions {
  
  public static void main(String[] args) {
    
    int a = 10;
    int b = 0;

    
    try {
     // divide(a, b) ;
      String name = "Harun" ;
      if (name.equals("Harun")) {
        throw new MyException("Name is Harun");
      }
    } catch (MyException e) {
      System.out.println(e.getMessage() );
    } 
    catch (ArithmeticException e) {
      System.out.println("Error: Division by zero is not allowed.");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    finally {
      System.out.println("Execution completed.");
    }
  }


  static int divide(int a, int b) throws ArithmeticException {
    if (b == 0) {
      throw new ArithmeticException("Do not divide by zero");
    }
    return a / b;
  }
}
