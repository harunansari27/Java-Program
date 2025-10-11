package Generics.Comparing;

public class Main {

  public static void main(String[] args) {
    
    Students harun = new Students(2, 88.9f);
    Students kyum = new Students(5, 92.5f);

    if(harun < kyum){
      System.out.println("Harun has less percentage than Kyum");
    } 
    else {
      System.out.println("Kyum has less percentage than Harun");
    }
   
  }
   
}
