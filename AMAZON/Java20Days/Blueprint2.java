package AMAZON.Java20Days;

public class Blueprint2 {

    String model;
    String color;
    int year;
    double price;

    // Constructor
    public Blueprint2(String model, String color, int year, double price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void startEngine() {
        System.out.println("Engine started for " + model);
    }

    public void stopEngine() {
        System.out.println("Engine stopped for " + model);
    }

    public static void main(String[] args) {

        Blueprint2 car1 =
            new Blueprint2("Toyota Camry", "Red", 2020, 24000.00);
        car1.startEngine();
        car1.stopEngine();

        Blueprint2 car2 =
            new Blueprint2("Honda Accord", "Blue", 2021, 26000.00);
        car2.startEngine();
        car2.stopEngine();
    }
}
