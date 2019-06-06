package FantasyAdventureLab.Items.Weapons;

import FantasyAdventureLab.Enemies.Enemy;

public class Weapon implements IWeapon{

    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType(){
        return weaponType;
    }

    public int getDamage(){
        return weaponType.getDamageByType();
    }

    public void attack(Enemy monster){
        monster.reduceHealth(getDamage());

    }



}
