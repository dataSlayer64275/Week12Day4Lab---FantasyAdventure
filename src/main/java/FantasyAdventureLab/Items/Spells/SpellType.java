package FantasyAdventureLab.Items.Spells;

public enum SpellType {

    FIREBALL(50),
    LIGHTNINGSTRIKE(60),
    WRATHOFSRI(100);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamageByType () {
        return this.damage;
    }

}

