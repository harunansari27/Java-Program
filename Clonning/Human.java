package Clonning;

public class Human implements Cloneable {
  
  public String name;
  public int age;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Human(Human other) {
    this.name = other.name;
    this.age = other.age;
  }


  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  } 

}
