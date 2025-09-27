package Properties.Access;

public class ObjectDemo {


  int num ;

  // Constructor
  public ObjectDemo(int num){
    this.num = num ;
  }
  
// convert into string
  @Override
  public String toString() {
    return "ObjectDemo []";
  }

  
  @Override
  protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
  }


  // get calls when garbage collector calls
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return super.equals(obj);
  }
  
  @Override
  protected void finalize() throws Throwable {
    // TODO Auto-generated method stub
    super.finalize();
  }


  public static void main(String[] args) {
    // ObjectDemo obj = new ObjectDemo(5) ;
    // ObjectDemo obj2 = new ObjectDemo(5) ;
    // System.out.println(obj.hashCode());
    // System.out.println(obj2.hashCode());
    //Output:- 918221580 , 2055281021

      ObjectDemo obj = new ObjectDemo(5) ;
    ObjectDemo obj2 =  obj  ;
    System.out.println(obj.hashCode());
    System.out.println(obj2.hashCode());
    //Output :- 918221580 , 918221580
  }

}
