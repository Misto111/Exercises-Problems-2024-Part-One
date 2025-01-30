package January2025.Vehicles;

public class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public Car setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    @Override
    public String toString() {
        return "Car " +
                "numberOfDoors=" + numberOfDoors +
                ", brand='" + brand +
                ", model='" + model;
    }
}
