package Properties.Inheritance.MultipleLevelInheritence;

public class Main {
  public static void main(String[] args) {
    
    CarPrice car1 = new CarPrice("BMW", "Black", 1500.5, 5000000);
    CarPrice car2 = new CarPrice(car1);

    System.out.println("Car 1 Details:");
    System.out.println("Name: " + car1.name);
    System.out.println("Color: " + car1.color);
    System.out.println("Weight: " + car1.weight + " kg");
    System.out.println("Price: $" + car1.price);

    System.out.println("\nCar 2 Details (Copy of Car 1):");
    System.out.println("Name: " + car2.name);
    System.out.println("Color: " + car2.color);
    System.out.println("Weight: " + car2.weight + " kg");
    System.out.println("Price: $" + car2.price);
  }
}
