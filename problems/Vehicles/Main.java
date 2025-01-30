package January2025.Vehicles;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Fiat", "Bravo", 5);
        Vehicle vehicle = new Vehicle("Fiat", "Punto");

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(vehicle);
        vehicles.add(car);

        for (Vehicle v : vehicles) {
            //System.out.println(v.getBrand() + " " + v.getModel());
            System.out.println(v.toString());
        }
    }


}
