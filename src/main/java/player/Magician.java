package player;

import player.Interfaces.IAttack;
import player.Interfaces.IDefend;

public class Magician extends Player implements IAttack, IDefend {
    private Ability weapon;
    private Ability defense;
    private int stamina;

    Magician(String name, Ability weapon, Ability defense) {
        super(name);
        this.weapon = weapon;
        this.defense = defense;
        this.stamina = 100;
    }

    @Override
    public void damage(int amount) {
        this.health -= (amount - this.defense.getStrength());
    }

    @Override
    public void attack(Player player) {
        int attackValue = Math.floorDiv(this.weapon.getStrength() * this.stamina, 100);
        player.damage(attackValue);
        this.stamina -= 10;
    }

    @Override
    public Ability getWeapon() {
        return this.weapon;
    }

    @Override
    public Ability getDefense() {
        return defense;
    }

    @Override
    public void switchWeapon(Ability weapon) {
        this.weapon = weapon;
    }

    public void switchDefense(Ability defense) {
        this.defense = defense;
    }

    public int getStamina() {
        return this.stamina;
    }
}
