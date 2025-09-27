package Properties.Access;

public class A {

 private int num ;
  String names ;
  int[] arr ;

  public int[] getArr() {
    return arr;
  }

  public void setArr(int[] arr) {
    this.arr = arr;
  }

  public int getNum() {
    return num;
  }


  public void setNum(int num) {
    this.num = num;
  }

  A(int num, String name){
    this.num = num ;
    this.names = name ;
    this.arr = new int[num] ;
  }
  
}
