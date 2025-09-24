package Class2.NonStaticExample;



public class InnerClasses {


  static  class Test {
     String name  ;

    Test(String name) {
      this.name = name ;
    }
  }
      
  public static void main(String[] args) {
    Test obj = new Test("Harun") ;
    Test obj2 = new Test("Ruhan") ;
  
    System.out.println(obj.name);
    System.out.println(obj2.name);

  }
}
