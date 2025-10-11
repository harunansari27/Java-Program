package Generics.Comparing;

public class Students implements Comparable<Students> {

    public int rollNo;
    public float percentage;

    public Students(int rollNo, float percentage) {
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
     // System.out.println("toString method called");
        return rollNo + " " + percentage;
    }

    @Override
    public int compareTo(Students o) {
        // Better: use Float.compare to avoid precision loss
       int diff = (int)(this.percentage - o.percentage);
       return diff;
    }

    // @Override
    // public String toString() {
    //     return "Students{" +
    //             "rollNo=" + rollNo +
    //             ", percentage=" + percentage +
    //             '}';
    // }
}
