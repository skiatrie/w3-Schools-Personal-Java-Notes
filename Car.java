

public class Car {
    int modelYear;
    String modelName;

    public Car(String modelName) {
        this(2020, modelName); // calling constructor from another constructor
    }

    public Car(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo() {
        System.out.println("Model Name: " + modelName + "\nModel Year: " + modelYear);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Corvette");
        Car car2 = new Car(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}