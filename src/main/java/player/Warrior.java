package player;

public class Warrior extends Player {
    private Ability weapon;
    private Ability defense;

    Warrior(String name, Ability weapon, Ability defense) {
        super(name);
        this.weapon = weapon;
        this.defense = defense;
    }

    @Override
    public void damage(int amount) {
        this.health -= (amount - this.defense.getStrength());
    }
}
