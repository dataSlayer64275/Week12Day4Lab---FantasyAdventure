package FantasyAdventureLab.Items.Spells;

import FantasyAdventureLab.Enemies.Enemy;

public class Spell implements ISpell {
    private SpellType spellType;

    public Spell(SpellType spellType) {
        this.spellType = spellType;
    }

    public int getDamage(){
        return spellType.getDamageByType();
    }
    public void cast(Enemy monster){
        monster.reduceHealth(getDamage());
    }
}
