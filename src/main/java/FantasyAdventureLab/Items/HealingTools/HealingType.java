package FantasyAdventureLab.Items.HealingTools;

public enum HealingType {
    POTIONLARGE(100),
    POTIONSMALL(40),
    HERB(70);

    private final int healingPoints;

    HealingType(int healingPoints){
        this.healingPoints = healingPoints;
    }

    public int getHealingPointsByType () {
        return this.healingPoints;
    }


}
