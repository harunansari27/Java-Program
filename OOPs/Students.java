class Students {

    String[] name   = new String[5];
    int[] age       = new int[5];
    float[] marks   = new float[5];

    Stud[] stud     = new Stud[5];

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

    Stud[] students = new Stud[5];

    Stud harun = new Stud();

    harun.rno = 1;
    harun.name = "Harun";   
    harun.marks = 90.5f;

    System.out.println("---------------------------------------");
    System.out.println(harun);
    System.out.println("1. Roll No Of Student: "+harun.rno);
    System.out.println("2. Name Of Student: "+harun.name);
    System.out.println("3. Marks Of Student: "+harun.marks);
    System.out.println("4. City Of Student: "+harun.city);
    System.out.println("5. State Of Student: "+harun.state);
    System.out.println("---------------------------------------");

    }
}

class Stud {
    int rno;
    String name;
    float marks;
    String city = "Deoria";
    String state = "Uttar Pradesh";
}

