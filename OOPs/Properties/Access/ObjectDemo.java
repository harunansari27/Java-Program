package Properties.Access;

public class ObjectDemo {


  int num ;
  float f ;

  // Constructor
  public ObjectDemo(int num , float f){
    this.num = num ;
    this.f = f ;
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
    // return super.hashCode();
     return num;
     // 5 , 5 similar hashcode
  }


  // get calls when garbage collector calls
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return this.num == ((ObjectDemo)obj).num ;
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

    //   ObjectDemo obj = new ObjectDemo(5) ;
    // ObjectDemo obj2 =  obj  ;
    // System.out.println(obj.hashCode());
    // System.out.println(obj2.hashCode());
    //Output :- 918221580 , 918221580


      ObjectDemo obj = new ObjectDemo(5 , 8.9f) ;
      ObjectDemo obj2 = new ObjectDemo(5,7.9f) ;

      if ((obj).equals(obj2)) {
        System.out.println("Equal .Equals method");
      } else {
        System.out.println("Not Equal");
        
      }

      if(obj == obj2){
        System.out.println("Equal using comparision operator");

        
      }
        else{
          System.out.println("Not Equal comparision operator");
        

  }

}
}
