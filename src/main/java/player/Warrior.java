package player;

import player.Interfaces.IAttack;
import player.Interfaces.IDefend;

public class Warrior extends Player implements IAttack, IDefend {
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

    @Override
    public void attack(Player player) {
        player.damage(this.weapon.getStrength());
    }

    @Override
    public Ability getWeapon() {
        return this.weapon;
    }

    @Override
    public void switchWeapon(Ability weapon) {
        this.weapon = weapon;
    }

    @Override
    public Ability getDefense() {
        return this.defense;
    }
}
