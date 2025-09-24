package Properties.Inheritance;

public class BoxWeight extends Box {
  double weight ; 


  // default constructor
  BoxWeight() {
    this.weight = -1 ;
  }


  // constructor
  BoxWeight(double l, double h, double w, double weight) {
    super(l, h, w) ;
    this.weight = weight ;
  }
}
