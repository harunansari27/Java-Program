package Class2.NonStaticExample;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Main Method");
    greeting();
    System.out.println("Back to Main Method");
   
    // fun();

   // fun(); // we cannot call non-static method directly in static area
   // we have to create object of that class and then call non-static method
   System.out.println("==========================");
   System.out.println("Call goes to Non-Static Area");
   Main obj = new Main() ;
   obj.greet() ;
    
  }

  public static void greeting() {
    System.out.println("Hello Static Greeting");
   // this.fun();  // we cannot use "this" keyword in static area

  }

  public void fun() {
    System.out.println("Hello Non-Static Fun");
  } 

  public void greet() {
    System.out.println("Hello Non-Static Greet");
    fun(); // we can call non-static method directly in non-static area
    greeting(); // we can call static method directly in non-static area
    this.fun(); // we can use "this" keyword in non-static area
  }

}
