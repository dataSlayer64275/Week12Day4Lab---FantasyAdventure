package FantasyAdventureLab.Enemies;
import FantasyAdventureLab.Players.Player;
import FantasyAdventureLab.Rooms.Room;

public class Enemy {

    int health;

    public Enemy() {
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }

    public void attack(Player player) {
            player.decreaseHP(50);
        }

//    public void kill(){
//        if (health <= 0){
//            Room.removeEnemy(Enemy);
//        }
//    }
    }
