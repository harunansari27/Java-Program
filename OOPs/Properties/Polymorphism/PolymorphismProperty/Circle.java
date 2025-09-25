package Properties.Polymorphism.PolymorphismProperty;

public class Circle extends Shapes {
  void area() {
    super.area();
    System.out.println("Area of Circle");
    super.area();
  }
  
}
