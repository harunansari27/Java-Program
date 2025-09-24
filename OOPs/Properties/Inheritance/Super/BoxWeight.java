package Properties.Inheritance.Super;

public class BoxWeight extends Box {
  double weight ; 


  // default constructor
  BoxWeight() {
    this.weight = -1 ;
  }

  
  // constructor
  BoxWeight(double l, double h, double w, double weight) {
    // super keyword use to access parent class constructor
    super(l, h, w) ;
    System.out.println(super.l);
    System.out.println(super.h);
    System.out.println(super.w);
    System.out.println("============================");

    System.out.println(this.l);
    System.out.println(this.h);
    System.out.println(this.w);
    System.out.println("============================");
    
    super.l = l ;
    super.h = h ;
    super.w = w ;

    System.out.println(super.l);
    System.out.println(super.h);
    System.out.println(super.w);
    System.out.println("============================");

    this.weight = weight ;

  }

}
