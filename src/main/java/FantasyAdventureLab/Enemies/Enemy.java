package FantasyAdventureLab.Enemies;

public class Enemy {

    int health;

    public Enemy(){
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage){
        health -= damage;
    }
}
