package Properties.Inheritance.Super;

public class Main {
  
  public static void main(String[] args) {
    Box box = new Box(2, 3, 4) ;
    Box box2 = new Box(box) ;

    System.out.println(box.volume());
    System.out.println(box2.volume());

    System.out.println("box1 length " + box.l + " height " + box.h + " width " + box.w);
    System.out.println("box2 length " + box2.l + " height " + box2.h + " width " + box2.w);

    // System.out.println("********** Box Weight **********");
   
    
    System.out.println("********** Access parent class data using super key word  **********");
     BoxWeight boxweight = new BoxWeight() ;
    System.out.println(" weight " + boxweight.weight);
    System.out.println(" box length " + boxweight.l + " box height " + boxweight.h + " box width " + boxweight.w);

    BoxWeight boxweight2 = new BoxWeight(2, 3, 4,5) ;
    System.out.println(" weight " + boxweight2.weight);
    System.out.println("================================================");
    
  }
}
