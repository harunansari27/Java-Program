package Clonning;

public class Main {
  
  public static void main(String[] args) throws CloneNotSupportedException {
    Human human1 = new Human("Alice", 30);
    Human human2 = new Human(human1); // Cloning human1 to human2

    Human humam3 = (Human)human1.clone(); // Using clone method

    System.out.println("Human 1: " + human1.name + ", Age: " + human1.age);
    System.out.println("Human 2: " + human2.name + ", Age: " + human2.age); 
    System.out.println("Human 3: " + humam3.name + ", Age: " + humam3.age);
  }
}
