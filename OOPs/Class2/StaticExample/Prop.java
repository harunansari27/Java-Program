package Class2.StaticExample;

public class Prop {
  public static void main(String[] args) {
    Human harun = new Human(18, "Harun", 25000); 
    Human rahim = new Human(19, "Rahim", 30000); 
    Human karim = new Human(20, "Karim", 35000);


    // worst way to access static property or attribute
    // System.out.println("Population : " + harun.population);
    // System.out.println("Population : " + rahim.population);
    // System.out.println("Population : " + karim.population);

    // best way to access static property or attribute
    System.out.println("Population : " + Human.population);
    System.out.println("Population : " + Human.population);
    System.out.println("Population : " + Human.population);


  }
}
