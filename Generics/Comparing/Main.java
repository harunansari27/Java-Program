package Generics.Comparing;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    Students harun = new Students(2, 88.9f);
    Students kyum = new Students(5, 92.5f);
    Students arif = new Students(3, 88.9f);
    Students zia = new Students(1, 75.4f);
    Students sami = new Students(4, 92.5f); 

    Students[] student = {harun, kyum, arif, zia, sami};

    System.out.println(Arrays.toString(student));
    // Arrays.sort(student , new Comparator<Students>() {
    //   @Override
    //   public int compare(Students o1, Students o2) {
    //     return (int)(o1.percentage - o2.percentage);
    //   }
      
    // });

    // Anonymous class using lambda expression
    Arrays.sort(student, (o1, o2) -> (int)(o1.percentage - o2.percentage));

    System.out.println(Arrays.toString(student)); 

    // if(harun.compareTo(kyum) < 0){
    //   System.out.println(harun.compareTo(kyum));
    //   System.out.println("Harun has less percentage than Kyum");
    // } 
    // else if(harun.compareTo(kyum) > 0){
    //   System.out.println(harun.compareTo(kyum));
    //   System.out.println("Harun has more percentage than Kyum");
    // }
    // else{
    //   System.out.println(harun.compareTo(kyum));
    //   System.out.println("Harun and Kyum have same percentage");
    // }
   
  }
   
}
