package FantasyAdventureLab.Rooms;

import FantasyAdventureLab.Enemies.Enemy;
import FantasyAdventureLab.Players.Player;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Player> players;

    public Room(){
        enemies = new ArrayList<Enemy>();
        players = new ArrayList<Player>();
    }


    public int enemyNumber(){
        return enemies.size();
    }

    public void addEnemy(Enemy monster){
        enemies.add(monster);
    }

    public void removeEnemy(Enemy monster){
        enemies.remove(monster);
    }
}
