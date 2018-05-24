package player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    private Warrior dwarf;
    private Warrior knight;
    private Ability sword;
    private Ability armour;

    @Before
    public void before() {
        Ability axe = new Ability("Axe", 7);
        Ability shield = new Ability("Shield", 2);
        dwarf = new Warrior("Jeff", axe, shield);

        sword = new Ability("Sword", 6);
        armour = new Ability("Armour", 4);
        knight = new Warrior("Bob", sword, armour);
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
    public void canTakeDamage() {
        dwarf.damage(6);
        assertEquals(46, dwarf.getHealth());
    }

    @Test
    public void canHeal() {
        dwarf.damage(10);
        dwarf.heal(5);
        assertEquals(47, dwarf.getHealth());
    }

    @Test
    public void canHealToMoreThanFifty() {
        dwarf.heal(10);
        assertEquals(50, dwarf.getHealth());
    }

    @Test
    public void canAttackPlayer() {
        dwarf.attack(knight);
        assertEquals(47, knight.getHealth());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void canSwitchWeapon() {
        Ability crossbow = new Ability("Crossbow", 7);
        knight.switchWeapon(crossbow);
        assertEquals(crossbow, knight.getWeapon());
    }

    @Test
    public void canGetDefense() {
        assertEquals(armour, knight.getDefense());
    }
}