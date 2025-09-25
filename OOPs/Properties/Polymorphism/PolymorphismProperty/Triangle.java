package Properties.Polymorphism.PolymorphismProperty;

public class Triangle extends Shapes {

  void area() {
    super.area();
    System.out.println("Area of Triangle");
    super.area();
  }
  
}
