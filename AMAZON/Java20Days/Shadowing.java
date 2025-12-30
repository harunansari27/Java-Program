package AMAZON.Java20Days;

public class Shadowing {
  
   // Class-level variable

  static int x = 10; // Class-level variable

  public static void main(String[] args) {
    int x = 20;
    Shadowing obj = new Shadowing();
    System.out.println("Class-level x: " + Shadowing.x); // Accessing class-level variable
    System.out.println("Instance-level x: " + this.x); // Accessing instance-level variable
  }
}
