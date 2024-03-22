package carInfo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split("\\s+");

            if (data.length == 1) {
                String brand = data[0];
                Car car = new Car(brand);
                cars.add(car);
            }else {

                String brand = data[0];
                String model = data[1];
                int horsepower = Integer.parseInt(data[2]);

                Car car = new Car(brand, model, horsepower);
                cars.add(car);
            }


        }
        cars.forEach((car -> System.out.println(car.toString())));

        //for (Car car : cars) {
            //System.out.print(car.toString());
        }
    }
