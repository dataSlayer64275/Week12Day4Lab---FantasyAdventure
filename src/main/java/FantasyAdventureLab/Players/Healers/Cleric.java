package FantasyAdventureLab.Players.Healers;

import FantasyAdventureLab.Items.HealingTools.HealingTool;
import FantasyAdventureLab.Players.Player;

public class Cleric extends Player {

    HealingTool healintTool;


    public Cleric (String name, HealingTool healingTool ){
        super(name);
        this.healintTool = healingTool;

    }

//    public String heal(Monster monster){
//
//        healintTool.heal;
//
//    }
}
