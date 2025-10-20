package ExceptionHandling;

public class Exceptions {
  
  public static void main(String[] args) {
    
    int a = 10;
    int b = 0;

    divide(a, b) ;
    try {
      int c = a / b;
      System.out.println("Result: " + c);
    } catch (ArithmeticException e) {
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
