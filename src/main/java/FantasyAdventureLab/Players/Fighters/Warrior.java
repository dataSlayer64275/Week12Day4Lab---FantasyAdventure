package FantasyAdventureLab.Players.Fighters;

import FantasyAdventureLab.Enemies.Enemy;
import FantasyAdventureLab.Items.Weapons.IWeapon;
import FantasyAdventureLab.Players.Player;

public class Warrior extends Player {

    IWeapon weapon;


    public Warrior (String name, IWeapon weapon){
        super(name);
        this.weapon = weapon;
    }

    public void attack(Enemy monster){
        weapon.attack(monster);

    }
}
