package Properties.Inheritance.MultipleLevelInheritence;

public class CarWeight extends Car {
  
  double weight;

    CarWeight() {
      weight = 0.0;
    }

    CarWeight(double weight) {
      super();
      this.weight = weight;
    }

    CarWeight(CarWeight other) {

      super(other);
      this.weight = other.weight;
    }

    CarWeight(String name, String color,double weight) {
      super(name,color);
      this.weight = weight;
    }

}
