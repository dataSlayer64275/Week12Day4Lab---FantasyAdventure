package FantasyAdventureLab.Players.Fighters;
import FantasyAdventureLab.Armour.Armour;
import FantasyAdventureLab.Items.Weapons.IWeapon;
import java.util.ArrayList;

public class Warrior extends Fighter {

    private ArrayList<Armour> armour;

    public Warrior (String name, IWeapon weapon){
        super(name, weapon);
        this.armour = new ArrayList<Armour>();
    }

    public int getDefensePoints(){
        int totalDefensePoints = 0;
        for (Armour piece: armour){
            totalDefensePoints += piece.getDefensePoints();
        }
        return totalDefensePoints;
    }

    public void decreaseHP(int damage){
        HP -= ( damage - getDefensePoints());
    }

    public void addArmour(Armour piece) {
        this.armour.add(piece);
    }
}
