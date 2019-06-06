package FantasyAdventureLab.Armour;

public class Armour {

    private ArmourType armour;

    public Armour (ArmourType armour){
        this.armour = armour;
    }

    public int getDefensePoints() {
        return armour.getDefensePoints();
    }
}
