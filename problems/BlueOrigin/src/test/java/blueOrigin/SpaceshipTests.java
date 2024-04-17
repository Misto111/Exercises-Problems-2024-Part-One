package blueOrigin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SpaceshipTests {

    private Spaceship spaceship;
    private Astronaut firstAstronaut;
    private Astronaut secondAstronaut;
    private Astronaut thirdAstronaut;

    @Before
    public void setUp() {
        this.spaceship = new Spaceship("Fly Hachi", 250);
        this.firstAstronaut = new Astronaut("Hachi", 250);
        this.secondAstronaut = new Astronaut("Bachi", 200);
        this.thirdAstronaut = new Astronaut("   Machi", 150);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacityShouldFailWithNegativeNumber() {

        new Spaceship("Fly Hachi", -12);


    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldFailWithNull() {

        new Spaceship(null, 12);


    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldFailWithEmptyString() {

        new Spaceship("   ", 12);


    }

    @Test
    public void testCreateSpaceshipShouldWork() {

        new Spaceship("Fly Hachi", 12);


    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddShouldFailWithoutCapacity() {
        Spaceship spaceship = new Spaceship("Fly Hachi", 1);
        spaceship.add(firstAstronaut);
        spaceship.add(secondAstronaut);
    }

    @Test
    public void testCreateSpaceShipShouldWork() {
        Spaceship spaceship = new Spaceship("Fly Hachi", 12);

        Assert.assertEquals("Fly Hachi", spaceship.getName());
        Assert.assertEquals(12, spaceship.getCapacity());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddShouldFailWithDuplicateName() {
        Spaceship spaceship = new Spaceship("Fly Hachi", 1);
        spaceship.add(firstAstronaut);
        spaceship.add(firstAstronaut);
    }

    @Test
    public void testAddShouldWork() {
        Spaceship spaceship = new Spaceship("Fly Hachi", 3);
        spaceship.add(firstAstronaut);
        Assert.assertEquals(1, spaceship.getCount());
        spaceship.add(secondAstronaut);
        Assert.assertEquals(2, spaceship.getCount());
        spaceship.add(thirdAstronaut);
        Assert.assertEquals(3, spaceship.getCount());
    }

    @Test
    public void testRemoveShouldWork() {
        this.spaceship.add(firstAstronaut);
        Assert.assertEquals(1, spaceship.getCount());
        this.spaceship.remove(firstAstronaut.getName());
        Assert.assertEquals(0, spaceship.getCount());
    }

    @Test
    public void testRemoveShouldDoNotWork() {
        this.spaceship.add(firstAstronaut);
        Assert.assertEquals(1, spaceship.getCount());
        this.spaceship.remove("Bob");
        Assert.assertEquals(1, spaceship.getCount());
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("Fly Hachi", this.spaceship.getName());
    }
}
