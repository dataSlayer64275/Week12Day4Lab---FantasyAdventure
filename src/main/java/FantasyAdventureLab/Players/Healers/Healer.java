package FantasyAdventureLab.Players.Healers;

import FantasyAdventureLab.Items.HealingTools.IHealingTool;
import FantasyAdventureLab.Players.Player;

public abstract class Healer extends Player {

    IHealingTool healingTool;


    public Healer (String name, IHealingTool healingTool ){
        super(name);
        this.healingTool = healingTool;
    }

    public void heal(Player player){
        healingTool.heal(player);
    }

    public void setHealingTool(IHealingTool healingTool) {
        this.healingTool = healingTool;
    }
}
