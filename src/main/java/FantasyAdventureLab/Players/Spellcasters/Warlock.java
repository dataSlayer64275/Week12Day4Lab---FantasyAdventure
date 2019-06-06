package FantasyAdventureLab.Players.Spellcasters;

import FantasyAdventureLab.Defenders.Defender;
import FantasyAdventureLab.Items.Spells.ISpell;

public class Warlock extends Spellcaster {

    private Defender defender;

        public Warlock (String name, ISpell spell, Defender defender){
            super(name, spell);
            this.defender = defender;
        }

        public void decreaseHP(int damage){
            if (defender.getHealth() > 0){
                defender.reduceHealth(damage);
            } else {
                decreaseHP(damage);
            }

        }
}
