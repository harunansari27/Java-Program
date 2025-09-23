package Class1;

class FinalKey {

    public static void main(String[] args) {
        System.out.println("Before Modifying : " + harun.name);
// harun = new Student("Another Name"); // Error: Cannot assign a value to final variable 'harun'
        harun.name = "Mohan Lal"; // Allowed: Modifying the state of the object
        System.out.println("After Modifying : " + harun.name);
    }

    static final Student harun = new Student("Harun");
}

class Student {

    String name;
    // final int rno; // Blank Final Variable

    Student(String name) {
        this.name = name;

    }

    // void changeName() {
    //     name = "New Name"; // Error: Cannot assign a value to final variable 'name'
    // }
}
