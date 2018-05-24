package player.Interfaces;

import player.Ability;
import player.Player;

public interface IAttack {
    void attack(Player player, Ability weapon);
    void switchWeapon(Ability weapon);
}
