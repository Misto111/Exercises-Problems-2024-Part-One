package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {

    private static final int DUMMY_START_HEALTH = 10;
    private static final int DUMMY_START_EXPERIENCE = 10;
    private static final int AXE_START_ATTACK = 10;
    private static final int AXE_START_DURABILITY = 10;
    private static final int BROKEN_AXE_DURABILITY = 0;
    private static final int AXE_LOSE_DURABILITY_POINTS = 9;
    private static final int DUMMY_HEALTH_AFTER_ATTACK_WITH_BROKEN_AXE = 9;
    private static final int DUMMY_EXPERIENCE_AFTER_ATTACK_WITH_BROKEN_AXE = 9;

    private Dummy dummy;
    private Axe axe;

    @Before
    public void setup() {
        dummy = new Dummy(DUMMY_START_HEALTH, DUMMY_START_EXPERIENCE);
        axe = new Axe(AXE_START_ATTACK, AXE_START_DURABILITY);
    }

    @Test
    public void testAxeLoseDurabilityAfterAttack() {


        axe.attack(dummy);

        Assert.assertEquals(AXE_LOSE_DURABILITY_POINTS, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAttackWithBrokenAxeShouldThrowException() {

        Axe axe = new Axe(AXE_START_ATTACK, BROKEN_AXE_DURABILITY);
        Dummy dummy = new Dummy(DUMMY_HEALTH_AFTER_ATTACK_WITH_BROKEN_AXE, DUMMY_EXPERIENCE_AFTER_ATTACK_WITH_BROKEN_AXE);

        axe.attack(dummy);


    }


}