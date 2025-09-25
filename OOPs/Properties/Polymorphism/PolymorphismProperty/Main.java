package Properties.Polymorphism.PolymorphismProperty;

public class Main {

  public static void main(String[] args) {
    
    Shapes s;

    // Shapes s = new Shapes();
    // s.area();
    System.out.println("Call from Shapes class");
    s = new Shapes();
    s.area();
    System.out.println("Call from Shapes class end\n");


    // Shapes s = new Circle();
    // s.area();
    System.out.println("Call from Circle class");
    s = new Circle();
    s.area();
    System.out.println("Call from Circle class end\n");


     // Shapes s = new Square();
    // s.area();
    System.out.println("Call from Square class");
    s = new Square();
    s.area();
    System.out.println("Call from Square class end\n");

    

    // Shapes s = new Triangle();
    // s.area();
    System.out.println("Call from Triangle class");
    s = new Triangle();
    s.area();
    System.out.println("Call from Triangle class end\n");


    System.out.println("Thanks for using my code");
  }
  
}
