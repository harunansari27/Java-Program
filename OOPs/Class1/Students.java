package Class1;
class Students {

    String[] name   = new String[5];
    int[] age       = new int[5];
    float[] marks   = new float[5];

    //Stud[] stud     = new Stud[5];

    // Constructor
    // Students() {
    //     // Example object creation
    //     Stud harun = new Stud();
    //     harun.rno = 1;
    //     harun.name = "Harun";
    //     harun.marks = 90.5f;

    //     // Print the object
    //     System.out.println(harun);
    // }

  

   public static void main(String[] args) {

   // Stud[] students = new Stud[5];

    // Object Creation of Class Stud 
    Stud harun = new Stud(1 , "Harun", 90.5f, "Deoria", "Uttar Pradesh");
    Stud rahul = new Stud(2 , "Rahul", 85.0f, "Gorakhpur", "Uttar Pradesh");
    Stud ankit = new Stud(3 , "Ankit", 78.5f, "Lucknow", "Uttar Pradesh");

    // harun.rno = 1;
    // harun.name = "Harun";   
    // harun.marks = 90.5f;


    
    System.out.println("---------------------------------------");
    System.out.println(harun);
    System.out.println("1. Roll No Of Student: "+harun.rno);
    System.out.println("2. Name Of Student: "+harun.name);
    System.out.println("3. Marks Of Student: "+harun.marks);
    System.out.println("4. City Of Student: "+harun.city);
    System.out.println("5. State Of Student: "+harun.state);
    System.out.println("---------------------------------------");

    // Print all students details
    System.out.println("================== All Students Details =================");
    System.out.println(rahul);
    System.out.println(ankit);
    System.out.println(harun);
    System.out.println("=========================================================");

    }
}

class Stud {
    int rno;
    String name;
    float marks;
    // String city = "Deoria";
    // String state = "Uttar Pradesh";
    String city ;
    String state ;

    // Creation of Constructor
      Stud(int rno, String name, float marks, String city, String state)  {
      this.rno = rno;
      this.name = name;
      this.marks = marks;
      this.city = city;
      this.state = state; 
    }

    // Override toString() method to print object details
       public String toString() {
        return "Roll No: " + rno + ", Name: " + name + ", Marks: " + marks +
               ", City: " + city + ", State: " + state;
    }
}

