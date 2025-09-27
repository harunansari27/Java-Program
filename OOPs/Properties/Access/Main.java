package Properties.Access;

public class Main {
  public static void main(String[] args) {
    
    A obj = new A(5, "Harun") ;
  //  System.out.println(obj.num);
    System.out.println(obj.names);
    System.out.println(obj.arr.length);

    obj.getNum() ;
    obj.setNum(10);
    System.out.println(obj.getNum());



  }
}
