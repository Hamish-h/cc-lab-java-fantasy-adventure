package player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    private Warrior dwarf;

    @Before
    public void before() {
        Ability axe = new Ability("Axe", 7);
        Ability shield = new Ability("Shield", 2);
        dwarf = new Warrior("Jeff", axe, shield);
    }

    @Test
    public void canGetHealth() {
        assertEquals(50, dwarf.getHealth());
    }

    @Test
    public void canGetName() {
        assertEquals("Jeff", dwarf.getName());
    }

    @Test
    public void canGetTreasure() {
        assertEquals(0, dwarf.getTreasure());
    }

    @Test
    public void canCollectTreasure() {
        dwarf.collectTreasure(10);
        assertEquals(10, dwarf.getTreasure());
    }

    @Test
    public void canDamagePlayer() {
        dwarf.damage(6);
        assertEquals(46, dwarf.getHealth());
    }
}