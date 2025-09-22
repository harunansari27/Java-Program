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

    System.out.println(harun);
    System.out.println(harun.rno);
    System.out.println(harun.name);

    }
}

class Stud {
    int rno;
    String name;
    float marks;
}

