package FantasyAdventureLab.Players.Fighters;

import FantasyAdventureLab.Enemies.Enemy;
import FantasyAdventureLab.Items.Weapons.IWeapon;
import FantasyAdventureLab.Players.Player;

public abstract class Fighter extends Player {

    IWeapon weapon;


    public Fighter (String name, IWeapon weapon){
        super(name);
        this.weapon = weapon;
    }

    public void attack(Enemy monster){
        weapon.attack(monster);

    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
