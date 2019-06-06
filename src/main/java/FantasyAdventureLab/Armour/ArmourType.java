package FantasyAdventureLab.Armour;

public enum ArmourType {
    HELMET(10),
    CHAINMAIL(60),
    SHIELD(20),
    ARMOUR(100);

    private final int defendPoints;

    ArmourType(int defendPoints){

        this.defendPoints = defendPoints;
    }

    public int getDefensePoints () {
        return this.defendPoints;
    }

}
