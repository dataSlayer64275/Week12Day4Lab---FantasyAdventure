package FantasyAdventureLab.Players.Spellcasters;

import FantasyAdventureLab.Enemies.Enemy;
import FantasyAdventureLab.Items.Spells.ISpell;
import FantasyAdventureLab.Players.Player;

public abstract class Spellcaster extends Player {

    ISpell spell;

    public Spellcaster (String name, ISpell spell){
        super(name);
        this.spell = spell;

    }

    public void cast(Enemy monster){
        spell.cast(monster);
    }

    public void setISpell(ISpell spell) {
        this.spell = spell;
    }
}
