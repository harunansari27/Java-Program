package Properties.Inheritance.MultipleLevelInheritence;

public class CarPrice extends CarWeight {

  double price;

    CarPrice() {
      price = 0.0;
    }

    CarPrice(String name, String color,double weight , double price) {
      super(name,color,weight);
      this.price = price;
    }

    CarPrice(CarPrice other) {

      super(other);
      this.price = other.price;
    }
  
}
