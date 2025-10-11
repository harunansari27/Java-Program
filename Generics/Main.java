package Generics;

public class Main implements InterfaceOfGenericsType<Integer>{

  @Override
  public void display(Integer value) {
    System.out.println("Value is: " + value);
  }
  
}
