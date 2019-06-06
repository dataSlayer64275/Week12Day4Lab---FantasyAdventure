package FantasyAdventureLab.Players.Spellcasters;

import FantasyAdventureLab.Items.Spells.Spell;
import FantasyAdventureLab.Players.Player;

public class Wizard extends Player {

    Spell spell;

    public Wizard (String name, Spell spell ){
        super(name);
        this.spell = spell;

    }
//
//    public String cast(Monster monster){
//        spell.cast
//    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
