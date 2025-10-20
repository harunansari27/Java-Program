package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFuntion {
  public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>() ;
    for (int i = 0 ; i<5 ; i++) {
      list.add(i+1) ;
    }

    // Parameter -> Expression  //  This is body of lambda function
    // list.forEach( (n) -> { System.out.println(n * 2) ; } ) ;

    Consumer<Integer> fun = (n) -> { System.out.println(n * 2) ; } ;
    list.forEach(fun) ;

    // Operation sumOperation = (a , b) -> { return a + b ; } ;
    Operation sumOperation = (a , b) -> a + b  ;
    Operation multiplyOperation = (a , b) -> a * b  ;
    Operation subtractOperation = (a , b) -> a - b  ;
    Operation divideOperation = (a , b) -> a / b  ;


    System.out.println("Sum : " + sumOperation.operation(10, 5)) ;
    System.out.println("Multiply : " + multiplyOperation.operation(10, 5)) ;  
    System.out.println("Subtract : " + subtractOperation.operation(10, 5)) ;
    System.out.println("Divide : " + divideOperation.operation(10, 5)) ;
  }

  int sum (int a , int b) {
    return a+b ; 
  }

}

interface Operation {
  int operation (int a , int b) ;  
}
