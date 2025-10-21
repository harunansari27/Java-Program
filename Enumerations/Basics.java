package Enumerations;

public class Basics {
   enum Day {
      SUNDAY,
      MONDAY,
      TUESDAY,
      WEDNESDAY,
      THURSDAY,
      FRIDAY,
      SATURDAY ; 
      // these are enum constant 
      // public , static and final by default
      // can be accessed using Day.SUNDAY, Day.MONDAY etc.
      // since they are final we cannot create a subclass of enum
      // enum cannot extend any class as it already extends java.lang.Enum class
      //  type is Day
   }

   enum Color {
      RED, GREEN, BLUE ; 
   }

   enum Months {
      JANUARY,
      FEBRUARY,
      MARCH,
      APRIL,
      MAY,
      JUNE,
      JULY,
      AUGUST,
      SEPTEMBER,
      OCTOBER,
      NOVEMBER,
      DECEMBER  ; 

      Months() {

         System.out.println("Constructor called for : " + this);
         // constructor
         // enum constructors are private by default
         // cannot be public or protected
         // internally : public static final Months JANUARY = new Months();

        
      }


  
   }

   public static void main(String[] args) {
      Months month = Months.MARCH;
    
      // for (Months  mon : Months.values()) {
      //    System.out.println(mon);
      // }

      // System.out.println(month);
      // System.out.println(month.ordinal()); // prints the position of the enum constant (starting from 0)
   }

}
