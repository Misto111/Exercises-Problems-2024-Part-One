package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DummyTest {

    private static final int DUMMY_START_HEALTH = 10;
    private static final int DUMMY_START_EXPERIENCE = 10;
    private static final int AXE_START_ATTACK = 10;
    private static final int AXE_START_DURABILITY = 10;
    private static final int DEAD_AXE_HEALTH_POINTS = 0;
    private static final int DEAD_DUMMY_HEALTH_POINTS = 0;
    private static final int DUMMY_EXPECTED_EXPERIENCE = 10;
    private static final int DUMMY_TAKE_ATTACK_POINTS = 10;


    private Dummy dummy;
    private Axe axe;

    @Before
    public void setup() {
        dummy = new Dummy(DUMMY_START_HEALTH, DUMMY_START_EXPERIENCE);
        axe = new Axe(AXE_START_ATTACK, AXE_START_DURABILITY);
    }

    @Test
    public void testLoseHealthAfterAttack() {


        axe.attack(dummy);

        Assert.assertEquals(DEAD_DUMMY_HEALTH_POINTS, dummy.getHealth());
    }
    @Test(expected = IllegalStateException.class)
    public void testIsDeathThrowException() {

        Dummy dummy = new Dummy(DEAD_AXE_HEALTH_POINTS, DUMMY_START_EXPERIENCE);

        dummy.takeAttack(DUMMY_TAKE_ATTACK_POINTS);

    }
    @Test
    public void testDeadDummyGiveXP() {
        Dummy dummy = new Dummy(DEAD_DUMMY_HEALTH_POINTS,DUMMY_START_EXPERIENCE);

        int exp = dummy.giveExperience();

        Assert.assertEquals(DUMMY_EXPECTED_EXPERIENCE, exp);


    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyDoesntGiveXP () {


         int exp = dummy.giveExperience();
    }
}