package player;

public class Ability {
    private String name;
    private int strength;

    public Ability(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public int getStrength() {
        return this.strength;
    }
}
