package FantasyAdventureLab.Defenders;

public class Defender {

    int health;

    public Defender(){
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage){
        health -= damage;
    }
}
