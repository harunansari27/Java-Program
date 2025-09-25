package Properties.Inheritance.MultipleLevelInheritence;

public class Car {

  String name;
  String color;
  double price;


  Car() {
    name = "Unknown";
    color = "Unknown";
    price = 0.0;
  }


  Car(String name, String color, double price) {
    this.name = name;
    this.color = color;
    this.price = price;
  }

  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  Car(String name) {
    this.name = name;
  }

  Car(double price) {
    this.price = price;
  }

  Car(Car other) {
    this.name = other.name;
    this.color =other.color;
    this.price =other.price;
  }

  
  

  
}
