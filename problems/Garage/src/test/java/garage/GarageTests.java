package garage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class GarageTests {
    private final static int MAX_SPEED = 270;
    private Garage garage;
    private Car porsche;
    private Car bmw;
    private Car audi;

    @Before
    public void setup() {
        this.garage = new Garage();
        porsche = new Car("Porsche", 300, 120000);
        bmw = new Car("BMW", 320, 200000);
        audi = new Car("Audi", 260, 100000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddCarShouldThrow() {
        garage.addCar(null);
    }
    @Test
    public void testAddCarSuccessfully() {

        garage.addCar(porsche);
        Assert.assertEquals(1, garage.getCount());
        garage.addCar(bmw);
        Assert.assertEquals(2, garage.getCount());

    }
    @Test
    public void testGetCarsSuccessfully() {
        garage.addCar(porsche);
        List<Car> cars = garage.getCars();
        Assert.assertEquals(1, garage.getCount());
        Assert.assertTrue(cars.contains(porsche));
        Assert.assertEquals(porsche.getBrand(), cars.get(0).getBrand());

    }
    @Test
    public void testGetFastestCar() {
        garage.addCar(porsche);
        garage.addCar(bmw);
        garage.addCar(audi);
        List<Car> cars = garage.findAllCarsWithMaxSpeedAbove(MAX_SPEED);
        Assert.assertEquals(bmw.getBrand(), cars.get(1).getBrand());

    }
    @Test
    public void testGetMostExpensiveCar() {
        garage.addCar(porsche);
        garage.addCar(bmw);
        garage.addCar(audi);
        Car car = garage.getTheMostExpensiveCar();

        Assert.assertEquals(bmw.getBrand(), car.getBrand());

    }
    @Test
    public void testFindAllCarsByBrand() {
        garage.addCar(porsche);
        garage.addCar(bmw);
        garage.addCar(bmw);

        List<Car> cars = garage.findAllCarsByBrand(bmw.getBrand());

        Assert.assertEquals(2, cars.size());

    }
}