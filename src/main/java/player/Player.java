package player;

public abstract class Player {
    private String name;
    int health;
    int treasure;

    Player(String name) {
        this.name = name;
        this.health = 50;
        this.treasure = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getTreasure() {
        return this.treasure;
    }

    public abstract void damage(int amount);

    public void heal(int amount) {
        this.health += amount;

        if (this.health > 50) {
            this.health = 50;
        }
    }

    public void collectTreasure(int amount) {
        this.treasure += amount;
    }
}
