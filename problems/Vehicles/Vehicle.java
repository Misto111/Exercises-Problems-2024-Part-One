package January2025.Vehicles;

public class Vehicle {

    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public String toString() {
        return "Vehicle " +
                "brand='" + brand +
                ", model='" + model;
    }
}
