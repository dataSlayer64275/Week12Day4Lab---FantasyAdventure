package FantasyAdventureLab.Items.HealingTools;

import FantasyAdventureLab.Players.Player;

public class HealingTool implements IHealingTool{

    private HealingType healingtype;


    public HealingTool(HealingType healingType) {
        this.healingtype = healingType;
    }
    public int getHealingPoints(){
        return healingtype.getHealingPointsByType();
    }

    public void heal(Player player){
        player.increaseHP(getHealingPoints());

    }

}
