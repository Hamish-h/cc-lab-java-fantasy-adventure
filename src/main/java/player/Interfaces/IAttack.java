package player.Interfaces;

import player.Ability;
import player.Player;

public interface IAttack {
    void attack(Player player);
    void switchWeapon(Ability weapon);
    Ability getWeapon();
}
