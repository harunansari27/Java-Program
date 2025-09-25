package Properties.Polymorphism.PolymorphismProperty;

public class Square extends Shapes {

  void area() {
    super.area();
    System.out.println("Area of Square");
    super.area();
  }
  
}
