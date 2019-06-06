package FantasyAdventureLab.Players;

public abstract class Player {

    private String name;
    protected int HP;

    public Player(String name){
        this.name = name;
        HP = 100;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public void increaseHP(int healingPoints) {
        HP += healingPoints;
    }

    public void decreaseHP(int damage){
        HP -= damage;
    }

}
