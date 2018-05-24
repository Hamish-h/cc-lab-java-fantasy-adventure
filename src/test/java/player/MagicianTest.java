package player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MagicianTest {

    private Magician wizard;
    private Ability fireball;
    private Ability ogre;

    @Before
    public void before() {
        fireball = new Ability("Fireball", 10);
        ogre = new Ability("Wendy", 3);
        wizard = new Magician("Rincewind", fireball, ogre);
    }

    @Test
    public void canGetDefense() {
        assertEquals(ogre, wizard.getDefense());
    }

    @Test
    public void canSwitchDefense() {
        Ability dragon = new Ability("Winston", 4);
        wizard.switchDefense(dragon);
        assertEquals(dragon, wizard.getDefense());
    }

    @Test
    public void canAttack() {
        Ability axe = new Ability("Axe", 7);
        Ability shield = new Ability("Shield", 2);
        Warrior dwarf = new Warrior("Jeff", axe, shield);

        wizard.attack(dwarf);
        wizard.attack(dwarf);

        assertEquals(80, wizard.getStamina());
        assertEquals(35, dwarf.getHealth());
    }
}