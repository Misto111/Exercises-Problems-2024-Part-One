package cats;

import org.junit.Assert;
import org.junit.Test;

public class HouseTests {

    @Test(expected = IllegalArgumentException.class)
    public void testCreteHouseWithInvalidCapacity() {
        new House("House1", -4);

    }

    @Test(expected = NullPointerException.class)
    public void testCreteHouseWithInvalidName() {
        new House(null, 5);

    }
    @Test(expected = NullPointerException.class)
    public void testCreteHouseWithInvalidNameEmpty() {
        new House("", 5);

    }
    @Test
    public void testCreateHouse() {
        House house = new House("House1", 10);
        Assert.assertEquals("House1", house.getName());
        Assert.assertEquals(10, house.getCapacity());

    }
    @Test
    public void testAddCatSuccessfully() {
        House house = new House("House1", 10);
        Cat mike = new Cat("Mike");

        Assert.assertEquals(0, house.getCount());
        house.addCat(mike);
        Assert.assertEquals(1, house.getCount());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddCatFillHouseThrow() {
        House house = new House("House1", 1);
        Cat mike = new Cat("Mike");
        Cat bike = new Cat("Bike");
        house.addCat(mike);
        house.addCat(bike);

    }

    @Test
    public void testRemoveCatSuccessfully() {
        House house = new House("House1", 10);
        Cat mike = new Cat("Mike");
        Cat bike = new Cat("Bike");

        house.addCat(mike);
        house.addCat(bike);

        Assert.assertEquals(2, house.getCount());

        house.removeCat("Bike");
        Assert.assertEquals(1, house.getCount());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveCatNotExisting() {
        House house = new House("House1", 0);

        house.removeCat("Mike");

    }
    @Test
    public void testCatForSaleSuccessfully() {
        House house = new House("House1", 10);
        Cat mike = new Cat("Mike");
        house.addCat(mike);

       Cat returnedCat =  house.catForSale("Mike");
       Assert.assertFalse(returnedCat.isHungry());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCatForSaleNotExisting() {
        House house = new House("House1", 10);
        house.removeCat("Mike");
    }
    @Test
    public void testStatistics(){
        House house = new House("House1", 10);
        Cat mike = new Cat("Mike");
        Cat bike = new Cat("Bike");
        Cat like = new Cat("Like");

        house.addCat(mike);
        house.addCat(bike);
        house.addCat(like);

        Assert.assertEquals("The cat Mike, Bike, Like is in the house House1!", house.statistics());


    }
}
