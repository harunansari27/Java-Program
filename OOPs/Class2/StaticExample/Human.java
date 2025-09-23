package Class2.StaticExample;

public class Human {
  int age ;
  String name ;
  int salary ; 

  static long population ;

  public Human(int age, String name, int salary) {
    this.age = age ;
    this.name = name; 
    this.salary = salary ;

    // or population++ ;  or ++population ; or population += 1 ;
    Human.population = Human.population + 1 ; 
  }
}
