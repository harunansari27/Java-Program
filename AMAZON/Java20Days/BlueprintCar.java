package AMAZON.Java20Days;

public class BlueprintCar {
    String model;
    String color;
    int year;
    double price;

    public void startEngine() {
        System.out.println("Engine started for " + model);
    }

    public void stopEngine() {
        System.out.println("Engine stopped for " + model);
    }


    public static void main(String[] args) {
        BlueprintCar car1 = new BlueprintCar();
        car1.model = "Toyota Camry";
        car1.color = "Red";
        car1.year = 2020;
        car1.price = 24000.00;
        car1.startEngine();
        car1.stopEngine();

        BlueprintCar car2 = new BlueprintCar();
        car2.model = "Honda Accord";  
        car2.color = "Blue";
        car2.year = 2021;
        car2.price = 26000.00;
        car2.startEngine();
        car2.stopEngine();
    }
}
