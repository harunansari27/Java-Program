package Class2.NonStaticExample;

public class StaticInt {
  

  static int a = 10 ;
  static int b ;

  static {
    System.out.println("Hello Static Block : ");
    b = a * 4 ;
  }


  public static void main(String[] args) {

    StaticInt obj = new StaticInt() ;
    System.out.println(StaticInt.a + " " + StaticInt.b);

    StaticInt.b += 3 ;
    System.out.println(StaticInt.a + " " + StaticInt.b);


    StaticInt obj2 = new StaticInt() ;
    System.out.println(StaticInt.a + " " + StaticInt.b);  
    
  }
}
