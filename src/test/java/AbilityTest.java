import org.junit.Before;
import org.junit.Test;
import player.Ability;

import static org.junit.Assert.*;

public class AbilityTest {
    Ability weapon;

    @Before
    public void before() {
        weapon = new Ability("Axe", 5);
    }

    @Test
    public void hasName() {
        assertEquals("Axe", weapon.getName());
    }

    @Test
    public void hasStrength() {
        assertEquals(5, weapon.getStrength());
    }
}